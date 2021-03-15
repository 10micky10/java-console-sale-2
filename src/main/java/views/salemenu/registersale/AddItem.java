package views.salemenu.registersale;

import java.util.Scanner;

import container.ArrayItem;
import models.sale.Sale;
import tools.CleanScreen;

public class AddItem {
  protected static Sale sale = new Sale();

  private AddItem() {
  }

  public static void addItem() {
    CleanScreen.clean();
    Scanner keyboardInput = new Scanner(System.in);
    if (ClientDate.date.equals("") && ClientDate.user == null) {
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
      System.out.println("Enter Item id");
      int idItem = Integer.parseInt(keyboardInput.nextLine());
      if (idItem >= 0 && idItem < ArrayItem.getInstanceItemList().size()) {
        sale.setProduct(ArrayItem.getInstanceItemList().get(idItem));
      } else {
        System.out.println("Invalid id");
      }
    }
  }
}
