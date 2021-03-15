package controllers;

import java.util.ArrayList;

public class HandleEdit {

  public static <T> void edit(ArrayList<T> list, T element, int index) {
    list.set(index, element);
  }
}
