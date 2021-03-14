package views.itemmenu;

import java.util.Scanner;

import tools.CleanScreen;

public class ItemSwitch {
  private static String option;

  public static void itemSwitch(){
    Scanner keyboardInput = new Scanner(System.in);
    do {
      CleanScreen.clean();
      ItemMenu.getItemMenu();
      switch (option = keyboardInput.nextLine()) {
        case "1":
          ItemRegister.register();
          break;
        case "2":
          ItemRemove.remove();
          break;
        case "3":
          ItemEdit.edit();
          break;
        case "4":
          ItemShow.show();
          break;
        case "5":
          System.out.println("Returning to Main Menu");
          break;
        default :
          System.out.println("Invalid option");
      }
    } while (!(option.equals("5")));
  }
}
