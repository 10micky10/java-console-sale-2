package views.itemmenu;

import java.util.Scanner;

import container.ArrayItem;
import controllers.HandleRemove;
import tools.CleanScreen;

public class ItemRemove {

  public static void remove() {
    CleanScreen.clean();
    System.out.println("-------------------------------");
    System.out.println("         REMOVE ITEM           ");
    System.out.println("-------------------------------");
    System.out.print("Enter item id: ");
    Scanner keyboardInput = new Scanner(System.in);
    int idItem = keyboardInput.nextInt();
    System.out.println("-------------------------------");
    if (idItem >= 0 && idItem < ArrayItem.getInstanceItemList().size()) {
      HandleRemove.remove(ArrayItem.getInstanceItemList(), idItem);
      System.out.print("Remove Sucessfully");
    } else {
      System.out.println("Invalid id");
    }
  }
}
