package appname.model;

import javafx.scene.Group;
import javafx.scene.Scene;

import java.util.Random;

public class Background {
// private attributes
    private String backgroundColor = "cornsilk";
    private final int MAX_COLOR = 256;
//
//    public Background() {
//        this.backgroundColor = ;
//    }
//
//    public Background() {
//
//    }


    public String getBackgroundColor() {
        return backgroundColor;
    }
    
    public Background() {
        // Constructor
    }

    public void setRandomColor() {
        Random random = new Random();
        int r = random.nextInt();
        int g = random.nextInt();
        int b = random.nextInt();

    }

    // methods with business logic

    // necessary getters and setters

}
