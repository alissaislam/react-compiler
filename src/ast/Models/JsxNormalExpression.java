package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class JsxNormalExpression  extends JsxExpression{
    List<JsxExpression> jsxExpressionList = new ArrayList<> ();
    String operation;



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
}
