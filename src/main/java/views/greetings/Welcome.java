package views.greetings;

import java.util.Scanner;

import container.UserLogin;
import tools.CleanScreen;

public class Welcome {

  public static void showWelcomeMenu() {
    CleanScreen.clean();
    System.out.println("-------------------------------");
    System.out.println("            WELCOME            ");
    System.out.println("-------------------------------");
    System.out.println("Enter to console sale with:");
    System.out.println(UserLogin.userlogin);
    System.out.println("-------------------------------");
    System.out.println("Press enter to continue");
    Scanner keyboardInput = new Scanner(System.in);
    keyboardInput.nextLine();
  }
}
