package BuilderPattern;

public class PizzaBuilderDemo {
  public static void main(String[] args) {
    // Veg Pizza
    Pizza vegPizza = new Pizza.PizzaBuilder("Large")
            .crust("Thin Crust")
            .extraCheese(true)
            .vegetables(true)
            .build();

    // Non-Veg Pizza
    Pizza nonVegPizza = new Pizza.PizzaBuilder("Medium")
            .crust("Cheese Burst")
            .extraCheese(true)
            .chicken(true)
            .build();

    System.out.println(vegPizza);
    System.out.println(nonVegPizza);
  }
}

