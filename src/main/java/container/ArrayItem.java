package container;

import models.item.Item;
import java.util.ArrayList;

public class ArrayItem {
  private static ArrayList<Item> itemList;

  private ArrayItem() {
  }

  public static ArrayList<Item> getInstanceItemList() {
    if (itemList == null) {
      itemList = new ArrayList<>();
      return itemList;
    }
    return itemList;
  }
}
