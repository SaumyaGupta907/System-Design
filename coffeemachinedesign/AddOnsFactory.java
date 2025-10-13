package coffeemachinedesign;

public class AddOnsFactory {
    coffee selectAddOn(String addon,coffee coffee)
    {
        if (addon.equals("skim milk"))
        {
            return new skimmilk(coffee);
        }
        else if  (addon.equals("Whole milk"))
        {
          return new wholemilk(coffee);
        }
        System.out.println("Bro read the menu addons nai hai");
        return coffee;
    }
}
