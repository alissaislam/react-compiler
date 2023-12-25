package ast.Models;

public class Id extends Node implements Data {
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
