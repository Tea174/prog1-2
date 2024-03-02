package be.kdg.screenreader.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

import java.util.ArrayList;
import java.util.EventListener;

public class ReadAloudHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("This is an exampple alert.");
        alert.setContentText("You can't read aloud yet, dummy.");
        alert.show();
        System.out.println("testing!");

    }
}
