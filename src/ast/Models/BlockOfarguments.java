package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class BlockOfarguments extends Node {
    List<Arguments> argumentsList=new ArrayList<> ();

    public List<Arguments> getArgumentsList() {
        return argumentsList;
    }

    public void setArgumentsList(List<Arguments> argumentsList) {
        this.argumentsList = argumentsList;
    }
}
