package ast.Models;

public class Argument extends Parameters{

    CallIdentifier callIdentifier;
    Expressions experssion;
    ArrowFunction arrowFunction;

    public CallIdentifier getCallIdentifier() {
        return callIdentifier;
    }

    public void setCallIdentifier(CallIdentifier callIdentifier) {
        this.callIdentifier = callIdentifier;
    }

    public Expressions getExperssion() {
        return experssion;
    }

    public void setExperssion(Expressions experssion) {
        this.experssion = experssion;
    }

    public ArrowFunction getArrowFunction() {
        return arrowFunction;
    }

    public void setArrowFunction(ArrowFunction arrowFunction) {
        this.arrowFunction = arrowFunction;
    }
}
