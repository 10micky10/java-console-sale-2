package views.salemenu.registersale;

import java.util.Scanner;
import tools.CleanScreen;

public class RegisterSaleSwitch {
  private static String option;

  public static void saleSwitch(){
    Scanner keyboardinput = new Scanner(System.in);
    do {
      CleanScreen.clean();
      RegisterSaleMenu.show();
      switch(option = keyboardinput.nextLine()) {
        case "1":
          ClientDate.register();
          break;
        case "2":
          AddItem.addItem();
          break;
        case "3":
          RegisterSale.register();
          break;
        case "4":
          System.out.println("Returning to Sale Menu");
          break;
        default:
        System.out.println("Invalid option");
      }

    } while (!(option.equals("4")));
  }
}
