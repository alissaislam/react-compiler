package ast.Models;

public class Number extends Node implements Data{
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
