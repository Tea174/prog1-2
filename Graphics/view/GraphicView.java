package Graphics.view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class GraphicView extends BorderPane {
    private Canvas canvas;
    private static final int CANVAS_WIDTH = 500;
    private static final int CANVAS_HEIGHT = 500;
    // Oval dimensions
    private static final int OVAL_WIDTH = 200;
    private static final int OVAL_HEIGHT = 100;

    public GraphicView() {
        initaliseNodes();
        draw();
        layoutNodes();
    }

    private void initaliseNodes() {
        canvas = new Canvas(CANVAS_WIDTH, CANVAS_HEIGHT);
    }

    private void layoutNodes() {
        setCenter(canvas);
    }
    void draw() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(new ImagePattern(new Image("/Vietnam.jpeg")));
        gc.strokeLine(10,10,200,500);
        gc.strokeOval(200,100,200,100);

        double ovalX = (CANVAS_WIDTH - OVAL_WIDTH) / 2;
        double ovalY = (CANVAS_HEIGHT - OVAL_HEIGHT) / 2;
        Image image = new Image("/Vietnam.jpeg");




        gc.setStroke(Color.web("#2FAB10"));
        gc.setLineWidth(4);
        gc.setLineDashes(10);
        gc.setFill(Color.hsb(0.8,0.3,0.9));


        //draw a circle at position 70,30 with a radius of 75px
        Circle circle = new Circle(70,30,75);
        circle.setStroke(Color.BLACK);

//        circle.setStroke();


    }
}
