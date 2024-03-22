package ImageSlider.View;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class ViewSlider extends BorderPane {
    private Image image1;
    private Image image2;
    private Canvas canvas;
    private Slider slider;
    private double percentage = 40;
    private double sliderValue = 0.5; // Initial value for the slider

    public ViewSlider() {
        initialiseNode();
        layoutNodes();
        updateCanvas();
        draw();
    }

    private void updateCanvas(){}
    private void initialiseNode() {

        canvas = new Canvas(500,500);
        image1 = new Image("/Vietnam.jpeg");
        image2 = new Image("/download.jpeg");
        ImageView imageView = new ImageView(image1);
        slider = new Slider();
    }
    private void layoutNodes() {
        setCenter(canvas);
        setBottom(slider);

    }

    void draw() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0,0, canvas.getWidth(), canvas.getHeight());
        double beforeDrawWidth = (canvas.getWidth() * percentage/100)*sliderValue;
        double afterDrawWidth = (canvas.getWidth() - beforeDrawWidth)*sliderValue;
        gc.drawImage(image1,
                0, 0,
                beforeDrawWidth, image1.getHeight(),
                0,0,
                beforeDrawWidth, image1.getHeight()
                );
        gc.drawImage(image2,
                beforeDrawWidth, 0,
                image2.getWidth(), image2.getHeight(),
                beforeDrawWidth, 0,
                afterDrawWidth,image2.getHeight());
        gc.strokeLine(beforeDrawWidth, 0,beforeDrawWidth, image1.getHeight());
        gc.setLineWidth(3);
        gc.setStroke(Color.BLACK);

        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);

        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            sliderValue = newValue.doubleValue();
        });
        ;

    }
}
