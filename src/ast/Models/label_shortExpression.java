package ast.Models;

public class label_shortExpression extends Expression{
    CallIdentifier callIdentifier;
    String operation;

    public CallIdentifier getCallIdentifier() {
        return callIdentifier;
    }

    public void setCallIdentifier(CallIdentifier callIdentifier) {
        this.callIdentifier = callIdentifier;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
