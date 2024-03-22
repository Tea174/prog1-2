package Grid;

import Grid.model.GridModel;
import Grid.view.GridPresenter;
import Grid.view.GridView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridModel gridModel = new GridModel(10,10);
        GridView gridView = new GridView();
        new GridPresenter(gridModel,gridView);

        primaryStage.setScene(new Scene(gridView));
        primaryStage.setTitle("Grid");
        primaryStage.setResizable(false);
        primaryStage.show();



    }
}
