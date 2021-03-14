package security;

import models.item.Item;

public class ValidateItem {

  public static boolean validate(Item item){
    if(item.name.length() == 0){
      return false;
    } else {
      return true;
    }
  }
}
