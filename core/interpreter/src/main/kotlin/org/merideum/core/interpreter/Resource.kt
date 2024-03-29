package org.merideum.core.interpreter

import org.merideum.core.interpreter.error.ScriptErrorType
import org.merideum.core.interpreter.error.ScriptSyntaxException
import org.merideum.core.interpreter.type.Type
import org.merideum.core.interpreter.type.TypedValue

interface Resource<T> : TypedValue<T> {
    /**
     * The name of the Resource
     */
    val name: String

    /**
     * The path of the Resource. The same path and name cannot be shared.
     */
    val path: String

    override val type: Type
        get() = Type.RESOURCE

    override fun stringify(): String {
        throw ScriptSyntaxException("Cannot use Resource as 'string'", ScriptErrorType.STRING)
    }
}
