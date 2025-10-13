package coffeemachinedesign;

public class CoffeeFactory {
    coffee createcoffee(String coffeename){
       if(coffeename.equals("Espresso"))
       {
           return new expresso();
       }
       else if(coffeename.equals("blackcoffee"))
        {
            return new blackcoffee();
        }
        return null;
    }
}
