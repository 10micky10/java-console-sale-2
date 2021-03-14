package views.greetings;

import container.UserLogin;

public class GoodBye {

  public static void showGoodByeMenu() {
    System.out.println("*******************************************");
    System.out.println("            EXIT TO CONSOLE SALE           ");
    System.out.println("BYE: " + UserLogin.userlogin);
    System.out.println("*******************************************");
  }
}