package org.merideum.core.interpreter.error

open class ScriptRuntimeException(override val message: String, val type: ScriptErrorType) : RuntimeException()
