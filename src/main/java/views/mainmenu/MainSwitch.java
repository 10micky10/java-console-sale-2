package views.mainmenu;

import java.util.Scanner;

import tools.CleanScreen;
import views.greetings.GoodBye;
import views.itemmenu.ItemSwitch;
import views.salemenu.SaleSwitch;
import views.usermenu.UserSwitch;

public class MainSwitch {
  private static String option;

  public static void show(){
    Scanner keyboardInput = new Scanner(System.in);
    do{
      CleanScreen.clean();
      MainMenu.showMenu();
      switch(option = keyboardInput.nextLine()) {
        case "1" :
          UserSwitch.show();
          break;
        case "2":
          ItemSwitch.itemSwitch();
          break;
        case "3":
          SaleSwitch.saleSwitch();
          break;
        case "4":
          GoodBye.showGoodByeMenu();
          break;
        default :
          System.out.println("Invalid Option");
      }
    } while (!(option.equals("4")));
  }
}
