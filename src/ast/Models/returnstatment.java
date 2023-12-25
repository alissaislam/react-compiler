package ast.Models;

public class Returnstatment extends Node{

    Experssion experssion;
    JsxBlock jsxBlock;

    public Experssion getExperssion() {
        return experssion;
    }

    public void setExperssion(Experssion experssion) {
        this.experssion = experssion;
    }

    public JsxBlock getJsxBlock() {
        return jsxBlock;
    }

    public void setJsxBlock(JsxBlock jsxBlock) {
        this.jsxBlock = jsxBlock;
    }
}
