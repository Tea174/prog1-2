package be.kdg.paint.view;

import be.kdg.paint.model.Component;
import be.kdg.paint.model.Size;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class PaintView extends BorderPane {
	private final ColorPicker colorPicker = new ColorPicker();
	private final ComboBox<String> shapePicker = new ComboBox<>();
	private final ComboBox<String> sizePicker = new ComboBox<>();
	private final Canvas canvas = new Canvas();
	private final VBox optionPane = new VBox();
	private final Button undo = new Button("Undo");


	public PaintView() {
		initialiseNodes();
		layoutNodes();
	}

	private void initialiseNodes() {
		colorPicker.setValue(Color.BLACK);
		shapePicker.setItems(FXCollections.observableArrayList("Line", "Square", "Circle"));
		ObservableList<String> sizes = FXCollections.observableArrayList();
		for (Size size: Size.values()) {
			sizes.add(size.toString());
		}
		sizePicker.setItems(sizes);
		shapePicker.getSelectionModel().selectFirst();
		sizePicker.getSelectionModel().selectFirst();
		canvas.setHeight(400);
		canvas.setWidth(400);
		clear();
	}

	private void layoutNodes() {
		optionPane.getChildren().addAll(colorPicker, shapePicker,sizePicker,undo);
		optionPane.setSpacing(20);
		optionPane.setPadding(new Insets(20));
		setLeft(optionPane);
		setCenter(canvas);

	}

	public Button getUndo() {
		return undo;
	}

	protected ColorPicker getColorPicker() {
		return colorPicker;
	}

	public ComboBox<String> getSizePicker() {
		return sizePicker;
	}

	protected ComboBox<String> getShapePicker() {
		return shapePicker;
	}

	protected Canvas getCanvas() {
		return canvas;
	}


	public void clear() {
		GraphicsContext ctx = canvas.getGraphicsContext2D();
		ctx.setFill(Color.WHITE);
		ctx.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
	}
}
