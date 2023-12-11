package ast.Models;

public class Stringg implements type {
  String value;

    public Stringg() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return
                "Stringg='" + value
                ;
    }
}
