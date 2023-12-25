package ast.Models;

public class Parameters {
    ArrowFunction arrowFunction;
    CallIdentifier callIdentifier;
    Argument argument;
    CallFunction callFunction;
    Experssion experssion;
    String NullLiteral;
    BlockOfarguments blockOfarguments;


    public ArrowFunction getArrowFunction() {
        return arrowFunction;
    }

    public void setArrowFunction(ArrowFunction arrowFunction) {
        this.arrowFunction = arrowFunction;
    }

    public CallIdentifier getCallIdentifier() {
        return callIdentifier;
    }

    public void setCallIdentifier(CallIdentifier callIdentifier) {
        this.callIdentifier = callIdentifier;
    }

    public Argument getArgument() {
        return argument;
    }

    public void setArgument(Argument argument) {
        this.argument = argument;
    }

    public CallFunction getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(CallFunction callFunction) {
        this.callFunction = callFunction;
    }

    public Experssion getExperssion() {
        return experssion;
    }

    public void setExperssion(Experssion experssion) {
        this.experssion = experssion;
    }

    public String getNullLiteral() {
        return NullLiteral;
    }

    public void setNullLiteral(String nullLiteral) {
        NullLiteral = nullLiteral;
    }

    public BlockOfarguments getBlockOfarguments() {
        return blockOfarguments;
    }

    public void setBlockOfarguments(BlockOfarguments blockOfarguments) {
        this.blockOfarguments = blockOfarguments;
    }
}
