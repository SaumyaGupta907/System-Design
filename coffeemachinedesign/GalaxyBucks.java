package coffeemachinedesign;

public class GalaxyBucks {

    public static void main(String[] args) {
        CoffeeVM cvm=new CoffeeVM();
        cvm.curstate.selectbasecoffee("Espresso");
        cvm.curstate.selectingaddons("Whole milk");
        cvm.curstate.selectingaddons("skim milk");
        cvm.curstate.gotopay();
        System.out.println("Your coffee cost"+cvm.getcost());
        cvm.curstate.pay(150);
        cvm.curstate.dispense();



    }
}
