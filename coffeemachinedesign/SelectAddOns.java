package coffeemachinedesign;

public class SelectAddOns extends State {
    CoffeeVM cvm;
    public SelectAddOns(CoffeeVM cvm) {
        this.cvm = cvm;
    }
    public void selectingaddons(String coffeename){
        this.cvm.setcoffee(this.cvm.createaddoncoffee(coffeename));
    }
    public void gotopay(){
        this.cvm.setState(new Payment(this.cvm));
    }
}
