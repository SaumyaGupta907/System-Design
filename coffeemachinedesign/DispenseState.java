package coffeemachinedesign;

public class DispenseState extends State {
    CoffeeVM cvm;
    public DispenseState(CoffeeVM cvm) {
        this.cvm = cvm;
    }
    public void dispense()
    {
        System.out.println("Serving Fresh Coffee...Stay Tuned");
        this.cvm.coffee=null;
        this.cvm.setState(new idleState(this.cvm));
    }

}
