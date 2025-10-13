package VendingMachine;

public enum Coin {
  Penny(1),
  Nickel(5),
  Dime(10),
  Quarter(25);

  int val;
  Coin(int val){
    this.val = val;
  }

  public int getValue() {
    return this.val;
  }
}
