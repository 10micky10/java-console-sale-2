package views.itemmenu;

import java.util.Scanner;

import container.ArrayListContainer;
import controllers.HandleAdd;
import models.item.Item;
import security.ValidateItem;
import tools.CleanScreen;

public class ItemRegister {
  private static ArrayListContainer arrayListContainer = ArrayListContainer.getInstance();

  public static void register(){
    CleanScreen.clean();
    System.out.println("-------------------------------");
    System.out.println("        REGISTER ITEM          ");
    System.out.println("-------------------------------");
    System.out.print("Item name: ");
    Scanner keyboardInput = new Scanner(System.in);
    Item itemRegister = new Item();
    itemRegister.name = keyboardInput.nextLine();
    System.out.println("-------------------------------");
    if (ValidateItem.validate(itemRegister)) {
      HandleAdd.add(arrayListContainer.itemList, itemRegister);
      System.out.println("Register Sucessfully");
    } else {
      System.out.println("Cannot Register because 1 camp is empty");
    }
  }
}
