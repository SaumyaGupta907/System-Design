package VendingMachineStatePattern;

public class DispensingState extends VendingMachineState{
  public DispensingState(VendingMachine vm){
    super(vm);
  }

  public void refund() {
    System.out.println("Dispensing in progress. Refund not allowed.");
  }

}
