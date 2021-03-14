package models.item;

import container.ArrayItem;

public class DefaultItem {

  public static void getDefaultItem() {
    
    Item item1 = new Item();
    item1.name = "Pepsi";
    ArrayItem.getInstanceItemList().add(item1);

    Item item2 = new Item();
    item2.name = "CocaCola";
    ArrayItem.getInstanceItemList().add(item2);

    Item item3 = new Item();
    item3.name = "Fanta";
    ArrayItem.getInstanceItemList().add(item3);

    Item item4 = new Item();
    item4.name = "Simba";
    ArrayItem.getInstanceItemList().add(item4);

    Item item5 = new Item();
    item5.name = "Sprite";
    ArrayItem.getInstanceItemList().add(item5);

    Item item6 = new Item();
    item6.name = "Agua";
    ArrayItem.getInstanceItemList().add(item6);

    Item item7 = new Item();
    item7.name = "Mineragua";
    ArrayItem.getInstanceItemList().add(item7);
  }
}
