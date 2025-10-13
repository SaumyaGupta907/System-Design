package DecoratorPattern;

public class ExtraCheese extends ToppingsDecorator{

  AbstractBasePizza basePizza;

  public ExtraCheese(AbstractBasePizza pizza){
    this.basePizza = pizza;
  }
  public int cost(){
    return this.basePizza.cost() + 10;
  }
}
