package appname;

import appname.model.ModelName;
import appname.view.AppNamePresenter;
import appname.view.AppNameView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args){launch(args);}

    @Override
    public void start(Stage primaryStage) {
        ModelName model = new ModelName();
        AppNameView view = new AppNameView();
        primaryStage.setScene(new Scene(view));
        new AppNamePresenter(model, view);
        primaryStage.show();
    }
}
