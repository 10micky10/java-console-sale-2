package security;

import container.ArrayListContainer;
import models.user.User;

public class Login {
  private static ArrayListContainer arrayListContainer = ArrayListContainer.getInstance();

  private Login() {
  }

  public static boolean validLogin(String userName, String password) {
    for (User user : arrayListContainer.userList) {
      if (user.userName.equals(userName) && user.password.equals(password)) {
        return true;
      }
    }
    System.out.println("Username or Pasword Incorrect");
    return false;
  }
}
