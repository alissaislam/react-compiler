package ast.Models;

import java.util.List;

public class IfShort extends Node{
    List<CallIdentifier> callIdentifiers;
    List<Operation> operations;
    List<Expressions> expressions;
    List<Statement> statements;
    List<JsxElement> jsxElements;

    public List<CallIdentifier> getCallIdentifiers() {
        return callIdentifiers;
    }

    public void setCallIdentifiers(List<CallIdentifier> callIdentifiers) {
        this.callIdentifiers = callIdentifiers;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public List<Expressions> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expressions> expressions) {
        this.expressions = expressions;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    public List<JsxElement> getJsxElements() {
        return jsxElements;
    }

    public void setJsxElements(List<JsxElement> jsxElements) {
        this.jsxElements = jsxElements;
    }
}
