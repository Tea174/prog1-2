package ChatApplication.view.receiver;
import ChatApplication.model.ChatModel;
import ChatApplication.view.sender.SenderView;

import java.util.List;

public class ReceiverPresenter {
    private final ChatModel model;
    private final ReceiverView view;



    public ReceiverPresenter(ChatModel model, ReceiverView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers() {
        this.view.button.setOnMouseClicked(mouseEvent -> {
            updateView();

        });
    }
    private void updateView() {/* fills view*/
        StringBuilder stringBuilder = new StringBuilder();
        List<String> list = model.getMessages();
        for (String s  : list) {
            stringBuilder.append("Received: ").append(s).append("\n");

        }


        ;
    }


}
