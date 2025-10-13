package VendingMachine;

public class SelectedItemState extends VendingMachineState{

  public SelectedItemState(VendingMachine vm){
    super(vm);
  }

  public void insertCoin(Coin coin){
    while (vm.curBalance < vm.selectedItem.getPrice()) {
      vm.addBalance(coin.getValue());
      System.out.println("Current balace is" + " " + vm.curBalance);
    }
  }
}
