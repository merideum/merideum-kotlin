package org.merideum.ktor.server.executor

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.nulls.shouldNotBeNull
import org.merideum.kotlin.merit.interpreter.ResourceResolver

class MerideumResourceResolverTests: DescribeSpec({
  lateinit var resourceResolver: ResourceResolver
  lateinit var serializerResolver: SerializerResolver

  class SimpleResource

  describe("resolve(name)") {
    describe("when the resource exists") {
      it("should resolve resource") {
        resourceResolver = MerideumResourceResolver(listOf(InternalResource("SimpleResource", "org.merideum.test", SimpleResource(), emptyMap())))

        resourceResolver.resolve("SimpleResource").shouldNotBeNull()
      }
    }

    describe("when the resource does not exist") {
      it("should return null") {
        resourceResolver = MerideumResourceResolver(listOf(InternalResource("WontResolve", "org.merideum.test", SimpleResource(), emptyMap())))

        resourceResolver.resolve("SimpleResource").shouldBeNull()
      }
    }
  }

  describe("resolve(name, path)") {
    describe("when the resource exists") {
      it("should resolve resource") {
        resourceResolver = MerideumResourceResolver(
          listOf(
            InternalResource("SimpleResource", "org.merideum.test", SimpleResource(), emptyMap()),
            InternalResource("SimpleResource", "org.merideum.test.not.it", SimpleResource(), emptyMap())
          )
        )

        resourceResolver.resolve("SimpleResource", "org.merideum.test").shouldNotBeNull()
      }
    }

    describe("when the resource does not exist") {
      it("should return null") {
        resourceResolver = MerideumResourceResolver(listOf(InternalResource("WontResolve", "org.merideum.test", SimpleResource(), emptyMap())))

        resourceResolver.resolve("SimpleResource", "org.merideum.test").shouldBeNull()
      }
    }
  }
})
