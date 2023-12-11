package ast.Models;

public class operation {
    String op;

    public operation() {
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    @Override
    public String toString() {
        return
                "op='" + op
                ;
    }
}
