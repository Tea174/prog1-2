package ImageSlider;


import ImageSlider.View.ViewSlider;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage)  {
        ViewSlider view = new ViewSlider();
        primaryStage.setScene(new Scene(view));
        primaryStage.setTitle("Vietnam");
        primaryStage.show();

    }
}
