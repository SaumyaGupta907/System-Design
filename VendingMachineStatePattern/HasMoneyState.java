package VendingMachineStatePattern;

public class HasMoneyState extends VendingMachineState{

  public HasMoneyState(VendingMachine vm){
    super(vm);
  }

  public void dispense(){
    vm.dispenseItem();
  }

  public void refund(){
    vm.setState(new DispensingState(vm));
    vm.dispenseItem();
  }
}
