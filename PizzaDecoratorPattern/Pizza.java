package PizzaDecoratorPattern;

public class Pizza {
  public static void main(String[] args) {

    // Base pizza
    AbstractBasePizza margherita = new MargheritaPizza();
    System.out.println("Margherita Pizza cost: " + margherita.cost());

    // Add Extra Cheese on Margherita
    AbstractBasePizza cheeseMargherita = new ExtraCheese(new MargheritaPizza());
    System.out.println("Margherita with Extra Cheese cost: " + cheeseMargherita.cost());

    // Add Mushrooms on Veggie
    AbstractBasePizza mushroomVeggie = new Mushrooms(new VeggiePizza());
    System.out.println("Veggie with Mushrooms cost: " + mushroomVeggie.cost());

    // Add both Extra Cheese + Mushrooms on Margherita
    AbstractBasePizza loadedPizza = new ExtraCheese(new Mushrooms(new MargheritaPizza()));
    System.out.println("Loaded Pizza (Margherita + Mushrooms + Extra Cheese) cost: " + loadedPizza.cost());
  }
}
