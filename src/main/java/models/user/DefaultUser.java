package models.user;

import container.ArrayUser;

public class DefaultUser {

  public static void defaultUser() {

    User user1 = new User();
    user1.name = "miguel";
    user1.lastName = "aguilar";
    user1.dni = "645121";
    user1.userName = "micky123";
    user1.password = "admin1234";
    ArrayUser.getInstanceUserList().add(user1);

    User user2 = new User();
    user2.name = "rodrigo";
    user2.lastName = "aguilar";
    user2.dni = "451245";
    user2.userName = "rodri123";
    user2.password = "1234";
    ArrayUser.getInstanceUserList().add(user2);
  }
}
