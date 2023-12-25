package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class Import extends Node{
    List<Id> ids = new ArrayList<>();
    Stringg stringg;

    public List<Id> getIds() {
        return ids;
    }

    public void setIds(List<Id> ids) {
        this.ids = ids;
    }

    public Stringg getStringg() {
        return stringg;
    }

    public void setStringg(Stringg stringg) {
        this.stringg = stringg;
    }
}
