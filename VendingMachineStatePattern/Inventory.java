package VendingMachineStatePattern;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
  Map<String, Item> itemList = new HashMap<>();
  Map<String, Integer> itemQuantity = new HashMap<>();


  public void addItem(String name, int price, int quantity) {
    itemList.put(name, new Item(name, price));
    itemQuantity.put(name, quantity);
  }

  public void reduceStock(String itemName) {
    System.out.println("Dispensing" + " " + itemName);
    this.itemQuantity.put(itemName, itemQuantity.get(itemName) - 1);
  }

  public boolean isAvailable(String itemName) {
    return itemQuantity.getOrDefault(itemName, 0) > 0;
  }

  public Item getItem(String itemName) {
    return itemList.get(itemName);
  }
}
