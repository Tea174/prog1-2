package Grid.view;

import Grid.model.GridModel;

public class GridPresenter {
    private GridModel gridModel;
    private GridView gridView;

    public GridPresenter(GridModel gridModel, GridView gridView) {
        this.gridModel = gridModel;
        this.gridView = gridView;
        updateView();
        addEventHandlers();
    }
    private void addEventHandlers() {
        updateView();

    }
    private void updateView() {
        gridView.drawGrid(gridModel.getColumnNumber(),gridModel.getRowNumber());
    }
}
