package Ex1;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Ex1 extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label helloLabel = new Label("Hello Tra!");
        BorderPane root = new BorderPane(helloLabel);
        Scene scene = new Scene(root);
        primaryStage.setWidth(500);
        primaryStage.setHeight(600);
        primaryStage.setResizable(true);
        primaryStage.setTitle("This is a title!");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage secondaryStage = new Stage();
        Group group = new Group();
        Scene scene2 = new Scene(group);
        scene2.setCursor(Cursor.CROSSHAIR);
        scene2.setFill(Color.rgb(225,200,0));
        secondaryStage.setScene(scene2);
        secondaryStage.show();



    }
}
