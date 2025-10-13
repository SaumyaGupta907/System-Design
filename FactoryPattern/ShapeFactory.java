package FactoryPattern;
public class ShapeFactory {

  public static Shape getShape(String s){
    switch(s) {
      case "CIRCLE":
        return new Circle();
      case "RECTANGLE":
        return new Rectangle();
      case "SQUARE":
        return new Square();
      default:
        return null;
    }
  }
}
