package org.merideum.core.interpreter.visitors

import org.merideum.antlr.MerideumParser
import org.merideum.antlr.MerideumParserBaseVisitor
import org.merideum.core.interpreter.WrappedValue
import org.merideum.core.interpreter.error.ScriptErrorType
import org.merideum.core.interpreter.error.ScriptSyntaxException
import org.merideum.core.interpreter.error.TypeMismatchedException
import org.merideum.core.interpreter.toModifier
import org.merideum.core.interpreter.type.ObjectValue
import org.merideum.core.interpreter.type.Type
import org.merideum.core.interpreter.type.TypedValue

class VariableVisitor(
    private val parent: ScriptVisitor
) : MerideumParserBaseVisitor<WrappedValue<*>>() {

    override fun visitVariableDeclaration(ctx: MerideumParser.VariableDeclarationContext): WrappedValue<Unit> {
        val name = ctx.simpleIdentifier().text
        val type = parent.visitTypeDeclaration(ctx.typeDeclaration()).value!!

        type.declareVariable(parent.scope, name)

        return WrappedValue.nothing()
    }

    /**
     * Declare a variable and assign a value.
     *
     * Ex:
     * const myVariable: int = 1234
     *
     * The type declaration is optional, but must match the value type if included.
     * A [TypeMismatchedException] is thrown if they do not match.
     *
     * Ex:
     * const myVariable = 1234
     */
    override fun visitVariableDeclarationAssignment(
        ctx: MerideumParser.VariableDeclarationAssignmentContext
    ): WrappedValue<*> {
        val name = ctx.simpleIdentifier().text
        val modifier = ctx.variableModifier().text.toModifier()

        // ANTLR4 may still report back a null assignment if the syntax is broken.
        if (ctx.assignment() == null) return WrappedValue.nothing()

        val assignedValue = parent.visitAssignment(ctx.assignment()).value

        if (assignedValue is TypedValue<*>) {
            val typeDeclarationContext = ctx.typeDeclaration()
            if (typeDeclarationContext != null) {
                checkThatDeclaredTypeMatchesAssignedValueType(typeDeclarationContext, assignedValue.type)
            }

            parent.scope.declareAndAssignVariable(name, assignedValue, modifier)
        }

        return WrappedValue.nothing()
    }

    private fun checkThatDeclaredTypeMatchesAssignedValueType(
        ctx: MerideumParser.TypeDeclarationContext,
        assignedValueType: Type
    ) {
        parent.visitTypeDeclaration(ctx).also {
            val declaredType = it.value!!

            if (assignedValueType != declaredType) {
                throw TypeMismatchedException(declaredType, assignedValueType)
            }
        }
    }

    override fun visitVariableReassignment(ctx: MerideumParser.VariableReassignmentContext): WrappedValue<*> {
        val name = ctx.simpleIdentifier().text
        val value = parent.visitAssignment(ctx.assignment()).value

        if (value is TypedValue<*>) {
            parent.scope.reassignVariable(name, value)
        }

        return WrappedValue.nothing()
    }

    override fun visitObjectFieldAssignment(ctx: MerideumParser.ObjectFieldAssignmentContext): WrappedValue<*> {
        val objectName = ctx.variableName.text
        val fieldName = ctx.fieldName.text

        val value = parent.visitAssignment(ctx.assignment()).value

        if (value is TypedValue<*>) {
            // TODO make sure the new value and old value are the same type
            val variable = parent.scope.resolveVariable(objectName)
                ?: throw ScriptSyntaxException(
                    "Could not find object for assignment",
                    ScriptErrorType.OBJECT_FIELD_ASSIGNMENT
                )

            val variableValue = variable.value

            // TODO throw exception if the variableValue's type is not ObjectValue
            if (variableValue is ObjectValue) {
                variableValue.setField(fieldName, value)
            }
        }

        return WrappedValue.nothing()
    }
}
