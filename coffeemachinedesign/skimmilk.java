package coffeemachinedesign;

public class skimmilk extends milk {
    public coffee coffee;
    skimmilk(coffee coffee) {
        this.coffee = coffee;
    }
    public int cost( )
    {
        return coffee.cost( )+30 ;
    }
}
