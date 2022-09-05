package org.merideum.ktor.server.resource

import org.merideum.core.interpreter.ScriptContext
import org.merideum.core.interpreter.Resource
import org.merideum.core.interpreter.type.ObjectValue
import org.merideum.core.interpreter.type.Type
import org.merideum.core.interpreter.type.TypedValue
import org.merideum.core.interpreter.type.list.ObjectListValue
import org.merideum.core.api.serializer.ObjectSerializer
import org.merideum.ktor.server.plugin.ResourceFunction

@Suppress("UNCHECKED_CAST")
class InternalResource<T>(
  override val name: String,
  override val path: String,
  override val value: T,
  private val functions: Map<String, ResourceFunction>
) : Resource<T> {

  override fun get(): T? {
    throw Exception("Cannot get a Resource.")
  }

  override fun getValue(): TypedValue<*> {
    throw RuntimeException("Cannot get value of internal resource")
  }

  override fun callFunction(context: ScriptContext, functionName: String, parameters: List<TypedValue<*>>): TypedValue<*> {

    val mapKey = buildMapKey(functionName, parameters)

    val foundFunction = functions[mapKey]

    if (foundFunction != null) {
      val functionParameters = foundFunction.parameters

      /**
       * Associate the parameters passed by the caller with the parameters of the function.
       */
      val functionParameterValues = functionParameters.zip(listOf(value) + parameters) { functionParameter, parameter ->
          val parameterValue = if (parameter is TypedValue<*>) {

            val parameterValue = parameter.get()

            if (parameter.type == Type.OBJECT) {

              functionParameter.type!!.serializer!!.deserialize(parameterValue as Map<String, TypedValue<*>>)
            } else if (parameter.type == Type.LIST_OBJECT) {
              val parameterSerializer = functionParameter.type!!.serializer!!

              val mappedValue = parameter.value as List<ObjectValue>

              mappedValue.map {
                // TODO support nullable value
                parameterSerializer.deserialize(it.get()!!.toMap())
              }
            }
            else {
              parameterValue
            }
          } else {
            parameter
          }

          functionParameter.kParameter to parameterValue
        }
      .toMap()

      val result = foundFunction.function.callBy(functionParameterValues)

      return if (foundFunction.returnType.type == Type.OBJECT) {
        val returnSerializer = foundFunction.returnType.serializer as ObjectSerializer<Any?>

        returnSerializer.serialize(result).getObjectValue()
      } else if (foundFunction.returnType.innerType != null) {
        val listResult = result as List<*>

        if (foundFunction.returnType.innerType == Type.OBJECT) {
          val returnSerializer = foundFunction.returnType.serializer as ObjectSerializer<Any?>

          ObjectListValue(listResult.map { returnSerializer.serialize(it).getObjectValue() })
        } else {
          foundFunction.returnType.type.newValue(listResult.map { foundFunction.returnType.innerType.newValue(it) })
        }
      }
      else {
        foundFunction.returnType.type.newValue(result)
      }
    }

    // TODO throw better exception
    throw RuntimeException("Could not find function '$functionName'")
  }

  private fun buildMapKey(functionName: String, parameters: List<TypedValue<*>>): String {
    return buildString {
      append(functionName)
      append("-")

      val parametersKey = parameters
        .map { it.type }
        .joinToString("-") { it.declarationKey }

      append(parametersKey)
    }
  }

  private fun typeFromList(listType: String): String {
    val start = listType.indexOf("<")
    val end = listType.lastIndexOf(">")

    return listType.substring(start..end)
  }
}