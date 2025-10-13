package CoffeeMachineDecorator;

public class Espresso implements BaseCoffee{

  @Override
  public int getCost() {
    return 50;
  }
}
