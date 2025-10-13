package DecoratorPattern;

public class Mushrooms extends ToppingsDecorator{

  AbstractBasePizza basePizza;

  public Mushrooms(AbstractBasePizza pizza){
    this.basePizza = pizza;
  }

  public int cost(){
    return this.basePizza.cost() + 30;
  }
}
