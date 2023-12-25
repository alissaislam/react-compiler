package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class JsxExpression extends Node{
List <JsxExpression> jsxExpressionList =new ArrayList<> ();
String operation;
int number;
String string;
boolean bool;
Id id;

    public List<JsxExpression> getJsxExpressionList() {
        return jsxExpressionList;
    }

    public void setJsxExpressionList(List<JsxExpression> jsxExpressionList) {
        this.jsxExpressionList = jsxExpressionList;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }
}
