package models.sale;

import java.util.ArrayList;

import models.item.Item;
import models.user.User;

public class Sale {
  public String date;
  public User client;
  private ArrayList<Item> productList;

  public Sale(){
    productList = new ArrayList<>();
  }

  public void setProduct(Item item){
    productList.add(item);
  }

  public ArrayList<Item> getProductList(){
    return productList;
  }
}
