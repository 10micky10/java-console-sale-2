package container;

import java.util.ArrayList;

import models.sale.Sale;

public class ArraySale {
  private static ArrayList<Sale> saleList;

  private ArraySale(){
  }

  public static ArrayList<Sale> getInstance(){
    if (saleList == null) {
      return saleList = new ArrayList<>();
    } else {
      return saleList;
    }
  }
}
