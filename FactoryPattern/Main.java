package FactoryPattern;

public class Main {

  public static void main(String[] args){
    Shape c = ShapeFactory.getShape("CIRCLE");
    c.draw();

    Shape r = ShapeFactory.getShape("RECTANGLE");
    r.draw();

    Shape s = ShapeFactory.getShape("SQUARE");
    s.draw();
  }

}
