package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class Label_normalExpressions extends Expressions {
    List<Expressions> expressions =new ArrayList<>();

    String operation;

    public List<Expressions> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expressions> expressions) {
        this.expressions = expressions;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
