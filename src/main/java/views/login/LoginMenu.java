package views.login;

import container.UserLogin;
import security.Login;
import tools.CleanScreen;
import views.greetings.Welcome;

import java.util.Scanner;

public class LoginMenu {
  protected static String userName;
  protected static String password;

  public static void showLoginMenu() {
    do {
      CleanScreen.clean();
      System.out.println("------------------------------");
      System.out.println("          LOGIN MENU          ");
      System.out.println("------------------------------");
      System.out.print("Username: ");
      Scanner keyboardInput = new Scanner(System.in);
      userName = keyboardInput.nextLine();
      System.out.println("------------------------------");
      System.out.print("Password: ");
      password = keyboardInput.nextLine();
      System.out.println("------------------------------");
    } while (!(Login.validLogin(userName, password)));
    UserLogin.userlogin = userName;
    Welcome.showWelcomeMenu();
  }
}
