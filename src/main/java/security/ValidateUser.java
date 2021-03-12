package security;

import models.user.User;

public class ValidateUser {
  
  public static boolean validate(User user){
    if(user.userName.length() == 0){
      return false;
    } else if (user.password.length() == 0) {
      return false;
    } else if (user.dni.length() == 0) {
      return false;
    } else if (user.name.length() == 0) {
      return false;
    } else if (user.lastName.length() == 0) {
      return false;
    } else {
      return true;
    }
  }
}
