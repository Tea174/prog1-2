package ChatApplication;

import ChatApplication.model.ChatModel;
import ChatApplication.view.sender.SenderPresenter;
import ChatApplication.view.sender.SenderView;
import ChatApplication.view.start.StartPresenter;
import ChatApplication.view.start.StartView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args){launch(args);}

    @Override
    public void start(Stage primaryStage) {
        ChatModel model = new ChatModel();
        StartView startView = new StartView();

        primaryStage.setScene(new Scene(startView));
        new StartPresenter(model, startView);
        primaryStage.setHeight(300);
        primaryStage.setWidth(300);

        primaryStage.setTitle("ChatApplication");
        primaryStage.show();

//        Stage senderWindow = new Stage();
//        SenderView senderView = new SenderView();
//        senderWindow.setScene(new Scene(senderWindow));
//        new SenderPresenter(model, senderView);
    }
}
