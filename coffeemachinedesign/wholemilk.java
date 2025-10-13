package coffeemachinedesign;

class wholemilk extends milk {
    public coffee coffee;
    wholemilk(coffee coffee) {
        this.coffee = coffee;
    }
    public int cost( )
    {
        return coffee.cost( )+20 ;
    }
}
