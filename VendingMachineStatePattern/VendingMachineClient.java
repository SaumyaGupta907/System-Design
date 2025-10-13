package VendingMachineStatePattern;

public class VendingMachineClient {

  public static void main(String []args){
    VendingMachine vm = new VendingMachine();
    vm.addItem("Pepsi", 25, 3);
    vm.addItem("Coke", 20, 2);
    vm.addItem("Ginger Ale", 30, 5);
    vm.addItem("Sprite", 15, 4);

    System.out.println("\n--- Step 1: Select an item ---");
    vm.selectItem("Coke");

    System.out.println("\n--- Step 2: Insert coins ---");
    vm.insertCoin(Coin.Quarter);

    System.out.println("\n--- Step 3: Dispense item ---");
    vm.dispenseItem();

    System.out.println("\n--- Step 1: Select an item ---");
    vm.selectItem("Ginger Ale");

    System.out.println("\n--- Step 2: Insert coins ---");
    vm.insertCoin(Coin.Dime);
    vm.insertCoin(Coin.Dime);
    vm.insertCoin(Coin.Dime);

    System.out.println("\n--- Step 3: Dispense item ---");
    vm.dispenseItem();


  }
}
