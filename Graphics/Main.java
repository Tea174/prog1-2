package Graphics;

import Graphics.model.GraphicModel;
import Graphics.view.GraphicView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage)  {
        GraphicView view = new GraphicView();
        GraphicModel model = new GraphicModel();
        Scene scene = new Scene(view);

        stage.setTitle("Painting 3");
        stage.setScene(scene);
        stage.show();

    }
}
