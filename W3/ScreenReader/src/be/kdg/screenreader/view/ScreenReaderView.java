package be.kdg.screenreader.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class ScreenReaderView extends BorderPane {
    private Button readButton;
    private TextArea textArea;


    public ScreenReaderView() {
            initializeNodes();
            layOutNote();
    }
    private void initializeNodes() {
        readButton = new Button("Read Aloud");
        textArea = new TextArea("Enter text to read");
    }
    private void layOutNote() {
        setCenter(textArea);
        setBottom(readButton);
        BorderPane.setAlignment(readButton, Pos.CENTER);
        BorderPane.setMargin(readButton, new Insets(10, 10, 10, 10));
    }
}
