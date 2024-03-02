package appname.view;
import appname.model.Reverse;
import javafx.scene.control.Button;

public class ReversePresenter {
    private final Reverse model;
    private final ReverseView view;

    public ReversePresenter(Reverse model, ReverseView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers() {
        view.getReverseButton().setOnAction(
                actionEvent -> view.setText(view.getTextArea().getText()));
        updateView();

    }
    private void updateView() {/* fills view*/
        model.getTextArea().setText(model.getText());

    }
}
