package VendingMachineStatePattern;

public class IdleState extends VendingMachineState{

  public IdleState(VendingMachine vm){
    super(vm);
  }

  public void selectItem(String item){
    vm.selectedItem = vm.inventory.itemList.get(item);
    vm.setState(new SelectedItemState(vm));

  }

}
