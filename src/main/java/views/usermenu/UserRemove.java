package views.usermenu;

import java.util.Scanner;

import container.ArrayListContainer;
import controllers.HandleRemove;
import tools.CleanScreen;

public class UserRemove {
  private static ArrayListContainer arrayListContainer = ArrayListContainer.getInstance();

  public static void remove(){
    CleanScreen.clean();
    System.out.println("-------------------------------");
    System.out.println("          REMOVE USER          ");
    System.out.println("-------------------------------");
    System.out.print("Enter user id: ");
    Scanner keyboardInput = new Scanner(System.in);
    int idUser = keyboardInput.nextInt();
    if(idUser >= 0 && idUser < arrayListContainer.userList.size()){
      HandleRemove.remove(arrayListContainer.userList, idUser);
      System.out.println("Removed Sucessfully");
    } else {
      System.out.println("Invalid Id");
    }
    System.out.println("-------------------------------");
  }
}
