package ast.Models;


import java.util.ArrayList;
import java.util.List;

public class JsxExpression extends Data {

    List<JsxExpression> jsxExpressionList = new ArrayList<> ();
    String operation;
    Number number;
    Stringg string;
    Bool bool;
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

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    public Stringg getString() {
        return string;
    }

    public void setString(Stringg string) {
        this.string = string;
    }

    public Bool getBool() {
        return bool;
    }

    public void setBool(Bool bool) {
        this.bool = bool;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }
}
