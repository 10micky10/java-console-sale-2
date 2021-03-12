package security;

import container.ArrayUser;
import models.user.User;

public class Login {
	private static ArrayUser arrayUser = ArrayUser.getInstanceUserList();

	private Login() {
	}

	public static boolean validLogin(String userName, String password) {
		for (User user : arrayUser.getList()) {
			if (user.userName.equals(userName) && user.password.equals(password)) {
				return true;
			}
		}
		return false;
	}
}
