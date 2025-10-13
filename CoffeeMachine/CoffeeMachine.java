package CoffeeMachine;

public class CoffeeMachine
{

  public static void main(String[] args) {

    BaseCoffee coffee =   new Cream(new OatMilk(new Espresso()));

    int totalCost = coffee.getCost();
    System.out.println(totalCost);
  }
}
