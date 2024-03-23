package be.kdg.paint.view;

import be.kdg.paint.model.Component;
import be.kdg.paint.model.Painting;
import be.kdg.paint.model.Size;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class PaintPresenter {
		private final Painting model;
		private final PaintView view;

		public PaintPresenter(Painting model, PaintView view) {
			this.model = model;
			this.view = view;
			addEventHandlers();
			updateView();
		}

		private void addEventHandlers() {
			view.getCanvas().setOnMouseClicked(event ->{
				double mouseX = event.getX();
				double mouseY = event.getY();

				Color colour = view.getColorPicker().getValue();
				String shape = view.getShapePicker().getValue();
				int size = Size.valueOf(view.getSizePicker().getValue()).getPixel();

				Component component = new Component(mouseX, mouseY, shape, colour, size);
				model.getComponents().add(component);
				updateView();
			});
			view.getUndo().setOnAction(e ->{
				if (!model.getComponents().isEmpty()){
					model.getComponents().remove(model.getComponents().size()-1);
					updateView();
				}
			});
		}

		private void updateView() {
			view.clear();
			GraphicsContext gc = view.getCanvas().getGraphicsContext2D();
			for (Component component: model.getComponents()) {
				Color colour = component.getColor();
				gc.setStroke(colour);
				if (component.getShape().equalsIgnoreCase("line")){
					gc.strokeLine(component.getX(), component.getY(),
							component.getX()+ component.getSize(),
							component.getY() + component.getSize());
				} else if (component.getShape().equalsIgnoreCase("circle")) {
					gc.strokeOval(compone.getX(), component.getY(),
							component.getSize(), component.getSize());
				} else {
					gc.strokeRect(component.getX(), component.getY(),
							component.getSize(), component.getSize());
				}
			}
		}
}
