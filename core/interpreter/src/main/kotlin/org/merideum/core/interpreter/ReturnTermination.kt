package org.merideum.core.interpreter

/**
 * Thrown to terminate a script and return a value.
 */
class ReturnTermination(val value: Any?) : Throwable()
