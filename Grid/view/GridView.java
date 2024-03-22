package Grid.view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;



public class  GridView extends BorderPane {
    private Canvas canvas;
    Label label1 = new Label();
    Label label2 = new Label();
    VBox vBox = new VBox();
    Slider slider1 = new Slider();
    Slider slider2 = new Slider();

    public GridView() {
        initializeNodes();
        layoutNodes();
    }

    private void initializeNodes () {
        canvas = new Canvas(640,400);
        label1 = new Label("Row");
        label2 = new Label("Column");
        slider1 = new Slider(2,20,2);
        slider2 = new Slider(2,20,2);
        vBox = new VBox(label1,slider1,label2,slider2);
    }

    private void layoutNodes() {
        setCenter(canvas);
        setBottom(vBox);

    }

    void drawGrid (int Column, int Row) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setStroke(Color.BLACK);
        double width = canvas.getWidth();
        double height = canvas.getHeight();

        //calculate the width and height of each cell in a grid
        double cellWidth = width / Column;
        double cellHeight = height / Row;

        for (int i = 0; i <= Column; i++) {
            double x = i * cellWidth;
            gc.strokeLine(x,0, x, height);
        }

        for(int i = 0; i <= Row; i ++) {
            double y = i * cellHeight;
            gc.strokeLine(0, y, width, y);
        }


//        gc.strokeLine(20,0,20,400);
//        gc.strokeLine(0,20,640,20);


    }
}
