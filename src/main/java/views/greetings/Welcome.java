package views.greetings;

import container.UserLogin;

public class Welcome {

	public static void showWelcomeMenu() {
	  System.out.println("-------------------------------");
	  System.out.println("            WELCOME            ");
	  System.out.println("-------------------------------");
	  System.out.println("Enter to console sale with:");
	  System.out.println(UserLogin.userlogin);
	  System.out.println("-------------------------------");
	}
}
