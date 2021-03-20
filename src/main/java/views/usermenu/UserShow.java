package views.usermenu;

import java.util.Scanner;

import container.ArrayListContainer;
import models.user.User;
import tools.CleanScreen;

public class UserShow {
  private static ArrayListContainer arrayListContainer = ArrayListContainer.getInstance();

  public static void show(){
    int index = 0;
    CleanScreen.clean();
    System.out.println("-------------------------------");
    System.out.println("          SHOW USER            ");
    System.out.println("-------------------------------");
    for(User user : arrayListContainer.userList){
      System.out.println("***                         ***");
      System.out.println("-------------------------------");
      System.out.println("Id: " + index);
      System.out.println("UserName: " + user.userName);
      System.out.println("Dni: " + user.dni);
      System.out.println("Name: " + user.name);
      System.out.println("Lastname: " + user.lastName);
      System.out.println("-------------------------------");
      index++;
    }
    System.out.println("Press enter to continue");
    Scanner keyboardInput = new Scanner(System.in);
    keyboardInput.nextLine();
  }
}
