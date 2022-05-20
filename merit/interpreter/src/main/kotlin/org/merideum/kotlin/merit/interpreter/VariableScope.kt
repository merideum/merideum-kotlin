package org.merideum.kotlin.merit.interpreter

import org.merideum.kotlin.merit.interpreter.error.VariableAlreadyDeclaredException

/**
 * Contains variables with a scope.
 */
data class VariableScope(
  val parent: VariableScope?,
  val variables: MutableMap<String, Variable>
) {

  /**
   * See if the variable exists in the current scope by its name.
   *
   * TODO: search the parent too.
   */
  fun resolveVariable(name: String) = variables[name]

  fun assignVariable(name: String, meritValue: MeritValue, modifier: Modifier?) {
    val resolved = resolveVariable(name)

    /**
     * Re-assign an existing variable.
     */
    if (modifier == null) {
      // TODO throw error. Cannot re-assign a variable that does not exist.
      if (resolved == null) return

      // TODO throw error. Cannot re-assign a CONST variable.
      if (resolved.modifier == Modifier.CONST) return

      resolved.value = meritValue.value
    } else {
      /**
       * Declare and assign a new variable.
       */
      if (resolved != null) throw VariableAlreadyDeclaredException(name)

      // TODO throw error. Cannot declare a CONST variable without an assignment
      if (modifier == Modifier.CONST && meritValue.value == Unit) return

      variables[name] = Variable(name, meritValue.value, modifier)
    }
  }

  companion object {
    fun main() = VariableScope(null, mutableMapOf())
  }
}