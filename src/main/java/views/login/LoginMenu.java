package views.login;

import container.UserLogin;
import security.Login;
import views.greetings.Welcome;

import java.util.Scanner;

public class LoginMenu {
	protected static String userName;
	protected static String password;

	public static void showLoginMenu() {
		do {
			System.out.println("------------------------------");
			System.out.println("          LOGIN MENU          ");
			System.out.println("------------------------------");
			System.out.print("Username: ");
			Scanner enterKeyPad = new Scanner(System.in);
			userName = enterKeyPad.nextLine();
			System.out.println("");
			System.out.println("------------------------------");
			System.out.print("Password: ");
			password = enterKeyPad.nextLine();
			System.out.println("");
			System.out.println("------------------------------");
		} while (!(Login.validLogin(userName, password)));
		UserLogin.userlogin = userName;
		Welcome.showWelcomeMenu();
	}
}
