package views.usermenu;

import java.util.Scanner;

import container.ArrayUser;
import controllers.HandleRemove;
import tools.CleanScreen;

public class UserRemove {

  public static void remove(){
    CleanScreen.clean();
    System.out.println("-------------------------------");
    System.out.println("          REMOVE USER          ");
    System.out.println("-------------------------------");
    System.out.println("Enter user id");
    Scanner keyboardInput = new Scanner(System.in);
    int idUser = keyboardInput.nextInt();
    if(idUser >= 0 && idUser < ArrayUser.getInstanceUserList().size()){
      HandleRemove.remove(ArrayUser.getInstanceUserList(), idUser);
      System.out.println("Removed Sucessfully");
    } else {
      System.out.println("Invalid Id");
    }
    System.out.println("-------------------------------");
  }
}
