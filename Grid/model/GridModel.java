package Grid.model;

import java.util.List;

public class GridModel {
    private int ColumnNumber;
    private int RowNumber;

    public GridModel(int ColumnNumber, int RowNumber) {
        this.ColumnNumber = ColumnNumber;
        this.RowNumber = RowNumber;
    }

    public int getColumnNumber() {
        return ColumnNumber;
    }

    public int getRowNumber() {
        return RowNumber;
    }
}
