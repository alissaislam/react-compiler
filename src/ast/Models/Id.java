package ast.Models;

public class Id implements type {
    String key;
    type value;

    public Id() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public type getValue() {
        return value;
    }

    public void setValue(type value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Id{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
