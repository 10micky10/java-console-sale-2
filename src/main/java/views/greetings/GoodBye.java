package views.greetings;

import container.UserLogin;
import tools.CleanScreen;

public class GoodBye {

  public static void showGoodByeMenu() {
    CleanScreen.clean();
    System.out.println("-------------------------------");
    System.out.println("            GOOD BYE           ");
    System.out.println("-------------------------------");
    System.out.print("Good Bye:");
    System.out.println(UserLogin.userlogin);
    System.out.println("-------------------------------");
  }
}