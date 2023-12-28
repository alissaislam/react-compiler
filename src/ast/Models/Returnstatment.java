package ast.Models;

public class Returnstatment extends Node{

    Expressions experssion;
    JsxBlock jsxBlock;

    public Expressions getExperssion() {
        return experssion;
    }

    public void setExperssion(Expressions experssion) {
        this.experssion = experssion;
    }

    public JsxBlock getJsxBlock() {
        return jsxBlock;
    }

    public void setJsxBlock(JsxBlock jsxBlock) {
        this.jsxBlock = jsxBlock;
    }
}
