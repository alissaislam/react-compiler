package ast.Models;

import java.util.ArrayList;

public class Array implements type {

    ArrayList<type> array;

    public Array() {
        this.array = new ArrayList<> ();
    }

    public void add (type element){
        array.add (element);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        for (type element : this.array){
            sb.append (element.toString ());
        }

        return sb.toString ();
    }
}
