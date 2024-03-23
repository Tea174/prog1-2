package be.kdg.paint;

import be.kdg.paint.model.Painting;
import be.kdg.paint.view.PaintPresenter;
import be.kdg.paint.view.PaintView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * DO NOT MODIfY THIS CLASS
 */
public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		Painting model = new Painting();
		PaintView view = new PaintView();
		PaintPresenter presenter = new PaintPresenter(model, view);
		primaryStage.setScene(new Scene(view));
		primaryStage.setTitle("FXPaint");
		primaryStage.show();
	}
}