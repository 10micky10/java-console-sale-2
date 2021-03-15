package container;

import models.user.User;

import java.util.ArrayList;

public class ArrayUser {
  private static ArrayList<User> userList;

  private ArrayUser() {
  }

  public static ArrayList<User> getInstanceUserList() {
    if (userList == null) {
      userList = new ArrayList<>();
      return userList;
    }
    return userList;
  }
}
