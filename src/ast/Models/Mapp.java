package ast.Models;


import java.util.HashMap;
import java.util.Map;


public class Mapp implements type{
    Map<type,type> map;

    public Mapp( ){
        this.map = new HashMap<> ();
    }


    public void add(type key,type value){
        map.put (key,value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder ();
        for (Map.Entry<type, type> entry : map.entrySet()){
            sb.append ("key: " + entry.toString () + "Value: " + entry.getValue());
        }
        return sb.toString ();
    }
}
