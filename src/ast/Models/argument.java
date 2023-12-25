package ast.Models;

<<<<<<< HEAD
 class Argument extends Node implements  Parameters{
=======
public class Argument extends Node{

    CallIdentifier callIdentifier;
    Experssion experssion;
    ArrowFunction arrowFunction;

    public CallIdentifier getCallIdentifier() {
        return callIdentifier;
    }

    public void setCallIdentifier(CallIdentifier callIdentifier) {
        this.callIdentifier = callIdentifier;
    }

    public Experssion getExperssion() {
        return experssion;
    }

    public void setExperssion(Experssion experssion) {
        this.experssion = experssion;
    }

    public ArrowFunction getArrowFunction() {
        return arrowFunction;
    }

    public void setArrowFunction(ArrowFunction arrowFunction) {
        this.arrowFunction = arrowFunction;
    }
>>>>>>> d901ae6fd1a189a6e26df3f95dd0447326035f1f
}
