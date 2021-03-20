package container;

import models.user.User;
import models.item.Item;
import models.sale.Sale;

import java.util.ArrayList;

public class ArrayListContainer {
  private static ArrayListContainer instance;
  public ArrayList<User> userList;
  public ArrayList<Item> itemList;
  public ArrayList<Sale> saleList;

  private ArrayListContainer() {
    userList = new ArrayList<>();
    itemList = new ArrayList<>();
    saleList = new ArrayList<>();
  }

  public static ArrayListContainer getInstance() {
    if (instance == null) {
      instance = new ArrayListContainer();
    }
    return instance;
  }
}
