package security;

import container.ArrayUser;
import models.user.User;

public class Login {

  private Login() {
  }

  public static boolean validLogin(String userName, String password) {
    for (User user : ArrayUser.getInstanceUserList()) {
      if (user.userName.equals(userName) && user.password.equals(password)) {
        return true;
      }
    }
    System.out.println("Username or Pasword Incorrect");
    return false;
  }
}
