package views.usermenu;

import java.util.Scanner;

import container.ArrayUser;
import controllers.HandleEdit;
import models.user.User;
import security.ValidateUser;
import tools.CleanScreen;

public class UserEdit {

  public static void edit(){
    CleanScreen.clean();
    System.out.println("-------------------------------");
    System.out.println("          EDIT USER            ");
    System.out.println("-------------------------------");
    System.out.print("Enter User id to edit: ");
    Scanner keyboardInput = new Scanner(System.in);
    int idEdit = Integer.parseInt(keyboardInput.nextLine());
    if (idEdit >= 0 && idEdit < ArrayUser.getInstanceUserList().size()) {
      System.out.println("-------------------------------");
      System.out.print("UserName: ");
      User userEdit = new User();
      userEdit.userName = keyboardInput.nextLine();
      System.out.println("-------------------------------");
      System.out.print("Password: ");
      userEdit.password = keyboardInput.nextLine();
      System.out.println("-------------------------------");
      System.out.print("Dni: ");
      userEdit.dni = keyboardInput.nextLine();
      System.out.println("-------------------------------");
      System.out.print("Name: ");
      userEdit.name = keyboardInput.nextLine();
      System.out.println("-------------------------------");
      System.out.print("Lastname: ");
      userEdit.lastName = keyboardInput.nextLine();
      System.out.println("-------------------------------");
      if(ValidateUser.validate(userEdit)){
        HandleEdit.edit(ArrayUser.getInstanceUserList(), userEdit, idEdit);
        System.out.println("Edit Sucessfully");
      } else {
        System.out.println("Cannot Edit because 1 camp is empty");
      }
    } else {
      System.out.println("Invalid id");
    }
    System.out.println("-------------------------------");
  }
}
