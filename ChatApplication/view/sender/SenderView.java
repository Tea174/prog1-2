package ChatApplication.view.sender;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class SenderView extends BorderPane {
    // private Node attributes (controls)

    TextArea textArea = new TextArea();
    Button button = new Button();
    TextField textField = new TextField();

    VBox layout = new VBox();


    public SenderView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        // create and configure controls
        button = new Button("Send!");
        textArea = new TextArea();
        textField = new TextField("Enter your message");
        layout.getChildren().addAll(button,textArea,textField);
    }

    private void layoutNodes() {
        setCenter(textArea);
        setBottom(textField);
        setBottom(button);


    }

    public TextArea getTextArea() {
        return textArea;
    }

    public Button getButton() {
        return button;
    }

    public TextField getTextField() {
        return textField;
    }
}
