package coffeemachinedesign;
public class CoffeeVM {
    State curstate;
    coffee coffee;
    CoffeeFactory cf;
    AddOnsFactory adf;
    CoffeeVM(){

        this.curstate=new idleState(this);
        this.cf=new CoffeeFactory();
        this.adf=new AddOnsFactory();

    }
    coffee createbasecoffee(String coffeename){
        return this.cf.createcoffee(coffeename);

    }
    coffee createaddoncoffee(String coffeename){
        return this.adf.selectAddOn(coffeename,this.coffee);
    }
    int getcost()
    {
        return this.coffee.cost();
    }
    void setcoffee(coffee coffee){
        this.coffee=coffee;
    }

    void setState(State State){
        this.curstate= State;
    }

}
