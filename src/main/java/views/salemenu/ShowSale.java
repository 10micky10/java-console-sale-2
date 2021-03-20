package views.salemenu;

import java.util.Scanner;

import container.ArrayListContainer;
import models.item.Item;
import models.sale.Sale;
import tools.CleanScreen;

public class ShowSale {
  private static ArrayListContainer arrayListContainer = ArrayListContainer.getInstance();

  public static void show(){
    CleanScreen.clean();
    System.out.println("-------------------------------");
    System.out.println("          SHOW SALE            ");
    System.out.println("-------------------------------");
    int index = 0;
    for(Sale sale : arrayListContainer.saleList) {
      System.out.println("***                         ***");
      System.out.println("-------------------------------");
      System.out.println("Sale Id: " + index);
      System.out.println("Date: " + sale.date);
      System.out.println("Client: " + sale.client.name + " "  + sale.client.lastName);
      System.out.println("-------------------------------");
      for (Item item : sale.getProductList()){
        System.out.println("Name Item: " + item.name);
        System.out.println("-------------------------------");
      }
      index++;
    }
    System.out.println("Enter enter to continue");
    Scanner keyboardInput = new Scanner(System.in);
    keyboardInput.nextLine();
  }
}
