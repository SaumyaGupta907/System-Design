package CoffeeMachine;

public class OatMilk extends Milk{
  BaseCoffee baseCoffee;

  public OatMilk(BaseCoffee base){
    this.baseCoffee = base;
  }

  public int getCost() {
    return this.baseCoffee.getCost() + 30;
  }
}
