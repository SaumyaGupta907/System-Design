package coffeemachinedesign;

public class idleState extends State {
    CoffeeVM cvm;
    public idleState( CoffeeVM cvm ) {
        this.cvm = cvm;
    }
    public void selectbasecoffee(String coffeename)
    {
        this.cvm.setcoffee(this.cvm.createbasecoffee(coffeename));
        this.cvm.setState(new SelectAddOns(this.cvm));

    }
}
