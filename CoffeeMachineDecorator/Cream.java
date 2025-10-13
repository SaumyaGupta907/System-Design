package CoffeeMachineDecorator;

public class Cream extends AddOnsDecorator{

  BaseCoffee baseCoffee;

  public Cream(BaseCoffee base)
  {
    this.baseCoffee = base;
  }

  @Override
  public int getCost() {
    return this.baseCoffee.getCost() + 5;
  }
}
