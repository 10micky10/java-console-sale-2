package models.item;

import container.ArrayListContainer;

public class DefaultItem {

  public static void getDefaultItem() {
    ArrayListContainer arrayListContainer = ArrayListContainer.getInstance();

    Item item1 = new Item();
    item1.name = "Pepsi";
    arrayListContainer.itemList.add(item1);

    Item item2 = new Item();
    item2.name = "CocaCola";
    arrayListContainer.itemList.add(item2);

    Item item3 = new Item();
    item3.name = "Fanta";
    arrayListContainer.itemList.add(item3);

    Item item4 = new Item();
    item4.name = "Simba";
    arrayListContainer.itemList.add(item4);

    Item item5 = new Item();
    item5.name = "Sprite";
    arrayListContainer.itemList.add(item5);

    Item item6 = new Item();
    item6.name = "Agua";
    arrayListContainer.itemList.add(item6);

    Item item7 = new Item();
    item7.name = "Mineragua";
    arrayListContainer.itemList.add(item7);
  }
}
