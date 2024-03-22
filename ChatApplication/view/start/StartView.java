package ChatApplication.view.start;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class StartView extends BorderPane {
    // private Node attributes (controls)
    private Button senderButton;
    private Button receiverButton;
    public StartView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        // create and configure controls
        senderButton = new Button("Open sender");
        receiverButton = new Button("Open receiver");
    }

    private void layoutNodes() {
        this.setLeft(senderButton);
        this.setRight(receiverButton);
    }
    // package-private Getters
    // for controls used by Presenter


    public Button getSenderButton() {
        return senderButton;
    }

    public Button getReceiverButton() {
        return receiverButton;
    }
}
