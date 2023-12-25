package ast.Models;

<<<<<<< HEAD
public class CallFunction extends Node implements  Parameters{
=======
import java.util.ArrayList;
import java.util.List;

public class CallFunction extends Node {
    List<Id> idList=new ArrayList<> ();
    List<JsxSimpleCallfunction> jsxSimpleCallfunctionList =new ArrayList<> ();

    public List<Id> getIdList() {
        return idList;
    }

    public void setIdList(List<Id> idList) {
        this.idList = idList;
    }

    public List<JsxSimpleCallfunction> getJsxSimpleCallfunctionList() {
        return jsxSimpleCallfunctionList;
    }

    public void setJsxSimpleCallfunctionList(List<JsxSimpleCallfunction> jsxSimpleCallfunctionList) {
        this.jsxSimpleCallfunctionList = jsxSimpleCallfunctionList;
    }
>>>>>>> d901ae6fd1a189a6e26df3f95dd0447326035f1f
}
