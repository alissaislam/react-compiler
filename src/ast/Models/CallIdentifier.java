package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class CallIdentifier extends  Parameters {
    Id id;
    List<Id> ids=new ArrayList<>();

    public Id getId() {
        return id;
    }

    public List<Id> getIds() {
        return ids;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public void setIds(List<Id> ids) {
        this.ids = ids;
    }
}
