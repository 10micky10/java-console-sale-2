package views.usermenu;

import java.util.Scanner;

import tools.CleanScreen;

public class UserSwitch {
  private static String option;

  public static void show(){
    Scanner keyboardInput = new Scanner(System.in);
    do{
      CleanScreen.clean();
      UserMenu.getUserMenu();
      switch (option = keyboardInput.nextLine()) {
        case "1" :
          UserRegister.register();
          break;
        case "2":
          UserRemove.remove();
          break;
        case "3":
          UserEdit.edit();
          break;
        case "4":
         UserShow.show();
         break;
        case "5":
          System.out.println("Returning to Main Menu");
          break;
        default :
          System.out.println("Invalid Option");
      }
    } while(!(option.equals("5")));
  }
}
