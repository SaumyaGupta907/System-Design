package CoffeeMachineDecorator;

public class WholeMilk extends Milk{
  BaseCoffee baseCoffee;

  public WholeMilk(BaseCoffee base){
    this.baseCoffee = base;
  }

  public int getCost() {
    return this.baseCoffee.getCost() + 10;
  }
}

