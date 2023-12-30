package ast.Models;

public  class Data extends Node {
    Array array;
    Number number;
    Stringg stringg;
    Id id;
    Map map;
    Bool bool;

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    public Stringg getStringg() {
        return stringg;
    }

    public void setStringg(Stringg stringg) {
        this.stringg = stringg;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Bool getBool() {
        return bool;
    }

    public void setBool(Bool bool) {
        this.bool = bool;
    }
}
