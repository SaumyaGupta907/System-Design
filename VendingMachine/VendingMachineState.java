package VendingMachine;

import javax.annotation.processing.SupportedSourceVersion;

public abstract class VendingMachineState {

  VendingMachine vm;
  public VendingMachineState(VendingMachine vm){
    this.vm = vm;
  }
  public void selectItem(String item){
    System.out.println("Action not supported");
  }
  public void insertCoin(Coin coin){
    System.out.println("Action not supported");
  }

  public void dispense(){
    System.out.println("Action not supported");
  }

  public void refund(){
    System.out.println("Action not supported");
  }

}
