package views.itemmenu;

import java.util.Scanner;

import container.ArrayListContainer;
import controllers.HandleEdit;
import models.item.Item;
import security.ValidateItem;
import tools.CleanScreen;

public class ItemEdit {
  private static ArrayListContainer arrayListContainer = ArrayListContainer.getInstance();

  public static void edit(){
    CleanScreen.clean();
    System.out.println("-------------------------------");
    System.out.println("           EDIT ITEM           ");
    System.out.println("-------------------------------");
    System.out.print("Enter id Item: ");
    Scanner keyboardInput = new Scanner(System.in);
    int idItem = Integer.parseInt(keyboardInput.nextLine());
    System.out.println("-------------------------------");
    System.out.print("Item name: ");
    Item itemEdit = new Item();
    itemEdit.name = keyboardInput.nextLine();
    System.out.println("-------------------------------");
    if (!(idItem >= 0 && idItem < arrayListContainer.itemList.size())) {
      System.out.println("Invalid id");
    } else {
      if (ValidateItem.validate(itemEdit)) {
        HandleEdit.edit(arrayListContainer.itemList, itemEdit, idItem);
        System.out.println("Edited Sucessfully");
      } else {
        System.out.println("Cannot edit because 1 camp is empty");
      }
    }
  }
}
