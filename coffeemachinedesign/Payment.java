package coffeemachinedesign;

public class Payment extends State {
    CoffeeVM cvm;
    public Payment(CoffeeVM cvm) {
        this.cvm = cvm;
    }
    public void pay(int amount)
    {
        if (this.cvm.getcost()==amount)
        {
            this.cvm.setState(new DispenseState(this.cvm));
            return;
        }
        System.out.println("Pay amount equal $"+this.cvm.getcost());
        this.refund(amount);

    }
    public void refund(int amount)
    {
        System.out.println("You refund $"+amount);
        this.cvm.coffee=null;
        this.cvm.setState(new idleState(this.cvm));
    }
}
