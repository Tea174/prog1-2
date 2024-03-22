package ChatApplication.view.start;
import ChatApplication.model.ChatModel;
import ChatApplication.view.receiver.ReceiverPresenter;
import ChatApplication.view.receiver.ReceiverView;
import ChatApplication.view.sender.SenderPresenter;
import ChatApplication.view.sender.SenderView;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class StartPresenter {
    private final ChatModel model;
    private final StartView view;

    public StartPresenter(ChatModel model, StartView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers() {
        view.getSenderButton().setOnAction(actionEvent -> ShowSenderView());
        view.getReceiverButton().setOnAction(actionEvent -> ShowReceiverView());
    }

    private void setAppView() {
        StartView startView = new StartView();
        view.getScene().setRoot(startView);
        startView.getScene().getWindow().sizeToScene();

    }

    private void ShowSenderView() {
        SenderView senderView = new SenderView();
        Stage senderStage = new Stage();
        senderStage.initOwner(view.getScene().getWindow());
        senderStage.initModality(Modality.NONE);
        senderStage.setTitle("Sender");
        senderStage.setScene(new Scene(senderView));
        senderStage.setX(view.getScene().getWindow().getX() + 200);
        senderStage.setY(view.getScene().getWindow().getY() + 200);

//        view.getScene().setRoot(senderView);
//        senderView.getScene().getWindow().sizeToScene();
        SenderPresenter senderPresenter = new SenderPresenter(model, senderView);
        senderStage.showAndWait();
    }

    private void ShowReceiverView() {
        ReceiverView receiverView = new ReceiverView();
        Stage receiverStage = new Stage();
        receiverStage.setTitle("Receiver");
        receiverStage.initOwner(view.getScene().getWindow());
        receiverStage.initModality(Modality.NONE);
        receiverStage.setScene(new Scene(receiverView));
        receiverStage.setX(view.getScene().getWindow().getX() + 200);
        receiverStage.setY(view.getScene().getWindow().getY() + 200);
//        view.getScene().setRoot(receiverView);
//        receiverView.getScene().getWindow().sizeToScene();
        ReceiverPresenter receiverPresenter = new ReceiverPresenter(model, receiverView );
        receiverStage.showAndWait();
    }

    private void updateView() {/* fills view*/}
}
