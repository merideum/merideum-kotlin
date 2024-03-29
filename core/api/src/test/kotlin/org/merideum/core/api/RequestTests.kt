package org.merideum.core.api

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.DescribeSpec
import org.merideum.core.api.error.RequestFailException
import org.merideum.core.interpreter.ScriptContext

class RequestTests : DescribeSpec({
    val variable = Request(mapOf())

    val context = ScriptContext()

    describe("callFunction") {

        it("should resolve and call function") {
            shouldThrow<RequestFailException> {
                variable.callFunction(context, "fail", emptyList())
            }
        }
    }
})
