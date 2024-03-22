package ChatApplication.view.receiver;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class ReceiverView extends BorderPane {
    // private Node attributes (controls)
    Button button = new Button();
    TextArea textArea = new TextArea();
    public ReceiverView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        // create and configure controls
        button = new Button("Get messages");
        textArea = new TextArea();
    }

    private void layoutNodes() {
        setCenter(textArea);
        setBottom(button);
    }
    // package-private Getters
    // for controls used by Presenter


    public Button getButton() {
        return button;
    }

    public TextArea getTextArea() {
        return textArea;
    }
}
