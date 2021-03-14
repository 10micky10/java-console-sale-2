package views.itemmenu;

import java.util.Scanner;

import container.ArrayItem;
import models.item.Item;
import tools.CleanScreen;

public class ItemShow {

  public static void show() {
    CleanScreen.clean();
    System.out.println("-------------------------------");
    System.out.println("           SHOW ITEM           ");
    System.out.println("-------------------------------");
    int index = 0;
    for (Item item : ArrayItem.getInstanceItemList()) {
      System.out.println("***                         ***");
      System.out.println("-------------------------------");
      System.out.println("Id: " + index);
      System.out.println("Item name: " + item.name);
      System.out.println("-------------------------------");
      index ++;
    }
    Scanner keyboardInput = new Scanner(System.in);
    System.out.println("Press enter to continue");
    keyboardInput.nextLine();
  }
}
