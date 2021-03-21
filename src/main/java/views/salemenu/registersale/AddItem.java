package views.salemenu.registersale;

import java.util.Scanner;

import container.ArrayListContainer;
import models.sale.Sale;
import tools.CleanScreen;

public class AddItem {
  private static ArrayListContainer arrayListContainer = ArrayListContainer.getInstance();
  protected static Sale sale = new Sale();

  private AddItem() {
  }

  public static void addItem() {
    CleanScreen.clean();
    Scanner keyboardInput = new Scanner(System.in);
    if (ClientDate.date.equals("") && ClientDate.user.name == null) {
      System.out.println("First Register Client and Date");
      System.out.println("Press enter to continue");
      keyboardInput.nextLine();
    } else {
      sale.date = ClientDate.date;
      sale.client = ClientDate.user;
      System.out.println("-------------------------------");
      System.out.println("           ADD ITEMS           ");
      System.out.println("-------------------------------");
      System.out.println("Client: " +  ClientDate.user.name + " " + ClientDate.user.lastName);
      System.out.println("-------------------------------");
      System.out.print("Enter Item id: ");
      int idItem = Integer.parseInt(keyboardInput.nextLine());
      if (idItem >= 0 && idItem < arrayListContainer.itemList.size()) {
        sale.setProduct(arrayListContainer.itemList.get(idItem));
        System.out.println("Add Product Sucessfully");
      } else {
        System.out.println("Invalid id");
      }
    }
  }
}
