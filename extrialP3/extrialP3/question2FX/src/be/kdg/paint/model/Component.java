package be.kdg.paint.model;

import javafx.scene.paint.Color;
/**
 * DO NOT MODIfY THIS CLASS
 */
public class Component {
  /** left top x coordinate */
  private  double x;
  /** left top y coordinate */
  private  double y;
  /** type of component.shape is one of line, square or circle **/
  private  String shape;
  /** color of component */
  private  Color color;
  /** width and height of component (both are always equal) in pixels */
  private  int size=40;



  public Component(double x, double y, String shape, Color color) {
    this.x = x;
    this.y = y;
    this.shape = shape;
    this.color = color;
  }

  public Component(double x, double y, String shape, Color color, int size) {
    this(x,y,shape,color);
    this.size=size;
  }

  public int getSize() {
    return size;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public String getShape() {
    return shape;
  }

  public Color getColor() {
    return color;
  }
}
