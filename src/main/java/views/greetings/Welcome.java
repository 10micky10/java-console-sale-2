package views.greetings;

import java.util.Scanner;

import container.UserLogin;

public class Welcome {

  public static void showWelcomeMenu() {
    System.out.println("*******************************************");
    System.out.println("                  WELCOME                  ");
    System.out.println("Login with: " + UserLogin.userlogin);
    System.out.println("*******************************************");
    System.out.println("Press enter to continue");
    Scanner keyboardInput = new Scanner(System.in);
    keyboardInput.nextLine();
  }
}
