package views.salemenu;

import java.util.Scanner;

import tools.CleanScreen;
import views.salemenu.registersale.RegisterSaleSwitch;

public class SaleSwitch {
  private static String option;

  public static void saleSwitch(){
    Scanner keyboardinput = new Scanner(System.in);
    do {
      CleanScreen.clean();
      SaleMenu.show();
      switch(option = keyboardinput.nextLine()) {
        case "1":
          RegisterSaleSwitch.saleSwitch();
          break;
        case "2":
        
      }

    } while (!(option.equals("4")));
  }
}
