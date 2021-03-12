package views.usermenu;

import java.util.Scanner;

import container.ArrayUser;
import controllers.HandleAdd;
import models.user.User;
import security.ValidateUser;
import tools.CleanScreen;

public class UserRegister {

  public static void register(){
    CleanScreen.clean();
    System.out.println("-------------------------------");
    System.out.println("        REGISTER USER          ");
    System.out.println("-------------------------------");
    System.out.print("UserName: ");
    User userRegister = new User();
    Scanner keyboardInput = new Scanner(System.in);
    userRegister.userName = keyboardInput.nextLine();
    System.out.println("-------------------------------");
    System.out.print("Password: ");
    userRegister.password = keyboardInput.nextLine();
    System.out.println("-------------------------------");
    System.out.print("Dni: ");
    userRegister.dni = keyboardInput.nextLine();
    System.out.println("-------------------------------");
    System.out.print("Name: ");
    userRegister.name = keyboardInput.nextLine();
    System.out.println("-------------------------------");
    System.out.print("Lastname: ");
    userRegister.lastName = keyboardInput.nextLine();
    System.out.println("-------------------------------");
    if(ValidateUser.validate(userRegister)){
      HandleAdd.add(ArrayUser.getInstanceUserList(), userRegister);
      System.out.println("Register Sucessfully");
    } else {
      System.out.println("Cannot Register because 1 camp is empty");
    }
  }
}
