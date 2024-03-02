package appname.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class AppNameView extends BorderPane {
    // private Node attributes (controls)
    private Button readButton;
    public AppNameView  () {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        // create and configure controls
        readButton = new Button("Repaint");
    }

    private void layoutNodes() {
        setBottom(readButton);
        BorderPane.setAlignment(readButton, Pos.BOTTOM_RIGHT);
        BorderPane.setMargin(readButton, new Insets(10, 10, 10, 10));
    }

    // package-private Getters
    // for controls used by Presenter


}
