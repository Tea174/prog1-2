package appname.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class ReverseView extends GridPane {
    // private Node attributes (controls)
    private static Button reverseButton;
    private static String textArea;

    public static Button getReverseButton() {
        return reverseButton;
    }


    public void setReverseButton(Button reverseButton) {
        this.reverseButton = reverseButton;
    }

    public static String getTextArea() {
        return textArea;
    }

    public ReverseView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        // create and configure controls
        reverseButton.setText("reverse");
        reverseButton.setAlignment(Pos.BASELINE_RIGHT);
        textArea.setStyle("-fx-background-color: white; -fx-grid-lines-visible: true");


    }

    private void layoutNodes() {



    }

    // package-private Getters
    // for controls used by Presenter


}
