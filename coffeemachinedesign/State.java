package coffeemachinedesign;

 abstract class State {
    CoffeeVM cvm;
    public void selectbasecoffee(String coffeename)
    {System.out.println("Operation Not allowed"); }
    public void selectingaddons(String coffeename){
        System.out.println("Operation Not allowed");
    }
    public void pay(int amount)
    {System.out.println("You sure got a lot of money");
    }
     public void dispense ()
     {System.out.println("One min sir... here is your Delulu coffee");
     }
     public void gotopay(){
        System.out.println("select you coffee first idiot");
     }
     public void refund(int amount)
     {System.out.println("Na bro me dont have any");
     }

}
