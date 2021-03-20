package views.salemenu;

import java.util.Scanner;

import container.ArrayListContainer;
import controllers.HandleRemove;
import tools.CleanScreen;

public class RemoveSale {
  private static ArrayListContainer arrayListContainer = ArrayListContainer.getInstance();

  public static void remove() {
    CleanScreen.clean();
    System.out.println("-------------------------------");
    System.out.println("          REMOVE SALE          ");
    System.out.println("-------------------------------");
    System.out.println("Enter id Sale");
    Scanner keyboardInput = new Scanner(System.in);
    int idSale = Integer.parseInt(keyboardInput.nextLine());
    if (idSale >= 0 && idSale < arrayListContainer.saleList.size()) {
      HandleRemove.remove(arrayListContainer.saleList, idSale);
      System.out.println("Remove Sucessfully");
    } else {
      System.out.println("Invalid Id");
    }
  }
}
