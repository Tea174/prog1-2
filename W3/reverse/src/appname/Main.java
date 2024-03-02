package appname;

import appname.model.Reverse;
import appname.view.ReversePresenter;
import appname.view.ReverseView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args){launch(args);}

    @Override
    public void start(Stage primaryStage) {
        Reverse model = new Reverse();
        model.setText("Enter text here");



        ReverseView view = new ReverseView();
        primaryStage.setScene(new Scene(view));
        new ReversePresenter(model, view);
        primaryStage.show();
    }
}
