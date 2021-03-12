package security;

import container.ArrayUser;
import models.user.User;

public class Login {

	private Login() {
	}

	public static boolean validLogin(String userName, String password) {
		for (User user : ArrayUser.getInstanceUserList()) {
			if (user.userName.equals(userName) && user.password.equals(password)) {
				System.out.println("Correct");
        return true;
			}
		}
    System.out.println("Incorrect");
		return false;
	}
}
