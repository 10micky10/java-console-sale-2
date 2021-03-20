package views.itemmenu;

import java.util.Scanner;

import container.ArrayListContainer;
import controllers.HandleRemove;
import tools.CleanScreen;

public class ItemRemove {
  private static ArrayListContainer arrayListContainer = ArrayListContainer.getInstance();

  public static void remove() {
    CleanScreen.clean();
    System.out.println("-------------------------------");
    System.out.println("         REMOVE ITEM           ");
    System.out.println("-------------------------------");
    System.out.print("Enter item id: ");
    Scanner keyboardInput = new Scanner(System.in);
    int idItem = keyboardInput.nextInt();
    System.out.println("-------------------------------");
    if (idItem >= 0 && idItem < arrayListContainer.itemList.size()) {
      HandleRemove.remove(arrayListContainer.itemList, idItem);
      System.out.print("Remove Sucessfully");
    } else {
      System.out.println("Invalid id");
    }
  }
}
