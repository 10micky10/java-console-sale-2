package views.salemenu.registersale;

import java.util.Scanner;

import container.ArrayListContainer;
import controllers.HandleAdd;
import models.item.Item;
import models.sale.Sale;
import tools.CleanScreen;

public class RegisterSale {
  private static ArrayListContainer arrayListContainer = ArrayListContainer.getInstance();

  public static void register() {
    CleanScreen.clean();
    Scanner keyboardInput = new Scanner(System.in);
    if (ClientDate.date.equals("") && ClientDate.user == null) {
      System.out.println("First Register Client and Date");
      System.out.println("Press enter to continue");
      keyboardInput.nextLine();
    } else if (AddItem.sale.client == null || AddItem.sale.getProductList().isEmpty()) {
      System.out.println("Sale without items");
      System.out.println("Add items first");
      System.out.println("Press enter to continue");
      keyboardInput.nextLine();
    } else {
      Sale sale = new Sale();
      sale = AddItem.sale;
      System.out.println("-------------------------------");
      System.out.println("         REGISTER SALE         ");
      System.out.println("-------------------------------");
      System.out.println("Client: " + sale.client.name + " " + sale.client.lastName);
      System.out.println("-------------------------------");
      System.out.println("             Items             ");
      System.out.println("-------------------------------");
      for (Item item :  sale.getProductList()) {
        System.out.println("Item name: " + item.name);
        System.out.println("-------------------------------");
      }
      System.out.println("Register Sale?\nYES(Y)/NO(N)");
      String reply = keyboardInput.nextLine();
      if (reply.equalsIgnoreCase("Y") || reply.equalsIgnoreCase("YES")) {
        HandleAdd.add(arrayListContainer.saleList, sale);
        ClientDate.user = null;
        ClientDate.date = "";
        AddItem.sale.client = null;
        AddItem.sale.getProductList().clear();
        System.out.println("Register Sucessfully");
      } else if (reply.equalsIgnoreCase("NO") || reply.equalsIgnoreCase("N")) {
        System.out.println("You can add more items");
      }
    }
  }
}
