package SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    List<StRow> rows = new ArrayList<>();

    public List<StRow> getRows() {
        return rows;
    }

    public void setRows(List<StRow> rows) {
        this.rows = rows;
    }
}
