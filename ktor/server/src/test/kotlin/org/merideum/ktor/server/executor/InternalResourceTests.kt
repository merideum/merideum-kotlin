package org.merideum.ktor.server.executor

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import org.merideum.kotlin.merit.ScriptContext
import org.merideum.kotlin.merit.interpreter.type.IntValue
import org.merideum.kotlin.merit.interpreter.type.ObjectValue
import org.merideum.kotlin.merit.interpreter.type.StringValue
import org.merideum.ktor.server.executor.serializer.ObjectSerializer
import org.merideum.ktor.server.plugin.FunctionParser

class InternalResourceTests: DescribeSpec({

  val instance = HelloWorldService()

  val variable = InternalResource(
    "test",
    "org.merideum",
    instance,
    FunctionParser().functionsForInstance(instance)
  )

  val context = ScriptContext(
    mapOf("serializerResolver" to
      SerializerResolver(
        mapOf(
          "org.merideum.ktor.server.executor.Person" to PersonSerializer(),
          "org.merideum.ktor.server.executor.Greeting" to GreetingSerializer(),
        )
      )
    )
  )

  describe("callFunction") {

    it("should resolve and call function") {
      variable.callFunction(context, "sayHello", emptyList()).get() shouldBe "Hello World!"
    }

    describe("callFunction() with a parameter") {
      it("should resolve and use parameter passed in") {
        variable.callFunction(context, "sayHello", listOf(StringValue("Merideum"))).get() shouldBe "Hello Merideum!"
      }
    }

    describe("callFunction() with many parameters") {
      it("should resolve and use parameters passed in") {
        variable.callFunction(context, "guessAge", listOf(StringValue("Merideum"), IntValue(0))).get() shouldBe "Hello Merideum! Are you 0 years old?"
      }
    }

    describe("parameter is a class with a serializer") {
      it("should resolve and call function with deserialized parameter") {
        variable.callFunction(context, "sayHello", listOf(ObjectValue(mutableMapOf("name" to "Merideum")))).get() shouldBe "Hello Merideum"
      }
    }

    describe("return type is a class with a serializer") {
      it("should resolve and call function returning serialized value") {
        variable.callFunction(context, "greet", listOf(StringValue("Merideum"))).get() shouldBe mapOf("message" to "Hello Merideum")
      }
    }
  }
})

data class Person(val name: String)

class PersonSerializer: ObjectSerializer<Person> {
  override fun serialize(value: Person): Map<String, Any?> {
    return mapOf("name" to value.name)
  }

  override fun deserialize(value: Map<String, Any?>): Person {
    val name: String = value["name"] as? String ?: throw RuntimeException("Could not get 'name' from map")

    return Person(name)
  }
}

data class Greeting(val message: String)

class GreetingSerializer: ObjectSerializer<Greeting> {
  override fun serialize(value: Greeting): Map<String, Any?> {
    return mapOf("message" to value.message)
  }

  override fun deserialize(value: Map<String, Any?>): Greeting {
    val message: String = value["message"] as? String ?: throw RuntimeException("Could not get 'message' from map")

    return Greeting(message)
  }
}

class HelloWorldService {
  fun sayHello() = "Hello World!"
  fun sayHello(name: String) = "Hello $name!"

  fun sayHello(person: Person) = "Hello ${person.name}"

  fun guessAge(name: String, age: Int) = "Hello $name! Are you $age years old?"

  fun greet(name: String) = Greeting("Hello $name")
}
