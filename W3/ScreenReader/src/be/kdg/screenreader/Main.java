package be.kdg.screenreader;

import be.kdg.screenreader.view.ScreenReaderView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.nio.Buffer;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
//        BorderPane root = new BorderPane();
//
//        TextArea textArea = new TextArea();
//        Button button = new Button("Read aloud!");
//        root.setCenter(textArea);
//        root.setBottom(button);

        ScreenReaderView screenReaderView = new ScreenReaderView();
        primaryStage.setTitle("Screen Reader");
        primaryStage.setWidth(700);
        primaryStage.setHeight(450);
        Scene primaryScene = new Scene(screenReaderView);
        primaryStage.setScene(primaryScene);
        primaryStage.show();
    }
}