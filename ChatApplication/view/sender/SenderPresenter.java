package ChatApplication.view.sender;
import ChatApplication.model.ChatModel;
import javafx.scene.control.Button;
import java.util.List;

public class SenderPresenter {
    private final ChatModel model;
    private final SenderView view;

    public SenderPresenter(ChatModel model, SenderView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers() {
        this.view.button.setOnMouseClicked(mouseEvent -> {
            view.button = new Button("Sent.");
        });
        this.view.button.setOnMouseClicked(mouseEvent -> {
            updateView();

        });

    }
    private void updateView() {/* fills view*/
        this.view.textField.clear();
        StringBuilder stringBuilder = new StringBuilder();
        List<String> list = model.getMessages();
        for (String s  : list) {
            stringBuilder.append(s).append("\n");
        }
        view.textArea.setText(stringBuilder.toString());




    }
}
