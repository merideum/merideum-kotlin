package org.merideum.core.interpreter.type

import org.merideum.core.interpreter.ScriptContext
import org.merideum.core.interpreter.error.FunctionNotFoundException
import org.merideum.core.interpreter.error.ScriptErrorType
import org.merideum.core.interpreter.error.ScriptRuntimeException

data class ObjectValue(override val value: MutableMap<String, TypedValue<*>>?) :
    TypedValue<MutableMap<String, TypedValue<*>>> {

    override val type = Type.OBJECT

    override fun callFunction(context: ScriptContext, functionName: String, parameters: List<TypedValue<*>>): Any? {
        if (value == null) throw FunctionNotFoundException(functionName)

        throw FunctionNotFoundException(functionName)
    }

    override fun get(): MutableMap<String, Any?>? {
        if (value == null) return null

        val newMap = mutableMapOf<String, Any?>()

        value.forEach { (key, value) ->
            newMap[key] = value.get()
        }

        return newMap
    }

    override fun getValue(): TypedValue<*> {
        return this
    }

    // TODO map the fields without TypedValue wrappers.
    override fun stringify(): String {
        return buildString {
            append("{")
            value?.forEach { (key, keyValue) ->
                append(key)
                append("=")
                append(keyValue.stringify())
                append(",")
            }
            // Remove last comma
            replace(length - 1, length, "")
            append("}")
        }
    }

    @Suppress("UNCHECKED_CAST")
    fun getField(name: String): TypedValue<*> {
        // TODO throw better exception.
        if (value == null) throw ScriptRuntimeException(
            "Cannot retrieve field of 'null' 'object'",
            ScriptErrorType.FIELD_REFERENCE
        )

        // TODO throw exception if a structure entry is not found for the value entry (there always should be one)
        return value[name]!!
    }

    fun setField(key: String, fieldValue: TypedValue<*>) {
        // TODO throw better exception.
        if (value == null) throw ScriptRuntimeException(
            "Cannot set field of 'null' 'object'",
            ScriptErrorType.OBJECT_FIELD_ASSIGNMENT
        )

        value[key] = fieldValue
    }

    override fun toString(): String {
        return stringify()
    }
}
