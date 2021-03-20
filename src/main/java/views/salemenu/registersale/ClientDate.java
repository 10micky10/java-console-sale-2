package views.salemenu.registersale;

import java.util.Scanner;

import container.ArrayListContainer;
import models.user.User;
import tools.CleanScreen;

public class ClientDate {
  private static ArrayListContainer arrayListContainer = ArrayListContainer.getInstance();
  protected static User user;
  protected static String date = "";

  private ClientDate() {
    user = new User();
  }

  public static void register() {
    CleanScreen.clean();
    System.out.println("-------------------------------");
    System.out.println("    REGISTER CLIENT AND DATE   ");
    System.out.println("-------------------------------");
    System.out.print("Enter client id: ");
    Scanner keyboardInput = new Scanner(System.in);
    int idClient = Integer.parseInt(keyboardInput.nextLine());
    if (idClient >= 0 && idClient < arrayListContainer.userList.size()) {
      user = arrayListContainer.userList.get(idClient);
      System.out.println("-------------------------------");
      System.out.print("Enter date: ");
      date = keyboardInput.nextLine();
      if(!(date.equals(""))){
        System.out.println("Register Client and Date Sucessfully");
      } else {
        user = null;
        System.out.println("Failed to Register Date cannot be empty");
      }
    } else {
      System.out.println("Invalid Id");
    }
  }
}
