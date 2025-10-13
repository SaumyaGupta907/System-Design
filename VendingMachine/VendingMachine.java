package VendingMachine;

public class VendingMachine {
  public Item selectedItem;
  public VendingMachineState currentSate;
  public int curBalance = 0;
  public Inventory inventory = new Inventory();


  public VendingMachine(){
    currentSate = new IdleState(this);
  }
  public void setState(VendingMachineState state){
    this.currentSate = state;
  }

  public void addBalance(int val){
    this.curBalance += val;
  }

  public void selectItem(String item){
    currentSate.selectItem(item);
  }

  public void insertCoin(Coin coin){
    currentSate.insertCoin(coin);
  }

  public void dispenseItem(){
    Item item = inventory.getItem(selectedItem.getItemName());
    if (curBalance >= item.getPrice()){
      inventory.reduceStock(item.getItemName());
      int remainingBal =  curBalance - item.getPrice();
      if(remainingBal > 0){
        System.out.println("Returning change" + " " + remainingBal);
      }
      curBalance = 0;
      setState(new IdleState(this));
    }
  }

  public Item addItem(String name, int price, int quantity){
    Item item = new Item(name, price);
    inventory.addItem(name, price, quantity);
    return item;
  }
}
