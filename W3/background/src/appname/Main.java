package appname;

import appname.model.Background;
import appname.view.AppNamePresenter;
import appname.view.AppNameView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args){launch(args);}

    @Override
    public void start(Stage primaryStage) {
        Background model = new Background();
        AppNameView view = new AppNameView();
        primaryStage.setTitle("background");
        primaryStage.setHeight(250);
        primaryStage.setWidth(400);
        primaryStage.setScene(new Scene(view));

        new AppNamePresenter(model, view);
        primaryStage.show();
    }
}
