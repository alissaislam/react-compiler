package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class Label_normalExpressions extends Parameters {
    List<Expression> expressions =new ArrayList<>();

    String operation;

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
