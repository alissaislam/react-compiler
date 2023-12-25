package ast.Models;

public class VariableDeclaration extends Node{
     Kind kind;
     Id id;
     Array array;
     Exception exception;
     CallIdentifier callIdentifier;
     CallFunction callFunction;
     ArrowFunction arrowFunction;

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public CallIdentifier getCallIdentifier() {
        return callIdentifier;
    }

    public void setCallIdentifier(CallIdentifier callIdentifier) {
        this.callIdentifier = callIdentifier;
    }

    public CallFunction getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(CallFunction callFunction) {
        this.callFunction = callFunction;
    }

    public ArrowFunction getArrowFunction() {
        return arrowFunction;
    }

    public void setArrowFunction(ArrowFunction arrowFunction) {
        this.arrowFunction = arrowFunction;
    }
}
