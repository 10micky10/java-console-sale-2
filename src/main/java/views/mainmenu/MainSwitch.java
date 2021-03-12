package views.mainmenu;

import java.util.Scanner;

import tools.CleanScreen;
import views.greetings.GoodBye;
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
          break;
        case "4":
          System.out.println("Exit to Console Sale");
          GoodBye.showGoodByeMenu();
        default :
          System.out.println("Invalid Option");
      }
    } while (!(option.equals("4")));
  }
}
