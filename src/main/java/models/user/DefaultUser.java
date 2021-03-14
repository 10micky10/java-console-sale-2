package models.user;

import container.ArrayUser;

public class DefaultUser {

  public static void defaultUser() {

    User user1 = new User();
    user1.name = "miguel";
    user1.lastName = "aguilar";
    user1.dni = "645121";
    user1.userName = "micky";
    user1.password = "micky123";
    ArrayUser.getInstanceUserList().add(user1);

    User user2 = new User();
    user2.name = "rodrigo";
    user2.lastName = "aguilar";
    user2.dni = "451245";
    user2.userName = "rodri123";
    user2.password = "1234";
    ArrayUser.getInstanceUserList().add(user2);

    User user3 = new User();
    user3.name = "Jose";
    user3.lastName = "Loreto";
    user3.dni = "458712";
    user3.userName = "Lor12";
    user3.password = "1234";
    ArrayUser.getInstanceUserList().add(user3);

    User user4 = new User();
    user4.name = "Edwin";
    user4.lastName = "Carpa";
    user4.dni = "78451";
    user4.userName = "Edwin";
    user4.password = "1234";
    ArrayUser.getInstanceUserList().add(user4);
  }
}
