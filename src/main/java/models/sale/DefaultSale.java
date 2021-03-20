package models.sale;

import container.ArrayListContainer;

public class DefaultSale {

  public static void defaultSale(){
    ArrayListContainer arrayListContainer = ArrayListContainer.getInstance();

    Sale sale1 = new Sale();
    sale1.date = "2021-01-01";
    sale1.client = arrayListContainer.userList.get(1);;
    sale1.setProduct(arrayListContainer.itemList.get(1));
    sale1.setProduct(arrayListContainer.itemList.get(2));
    arrayListContainer.saleList.add(sale1);

    Sale sale2 = new Sale();
    sale2.date = "2021-01-01";
    sale2.client = arrayListContainer.userList.get(2);
    sale2.setProduct(arrayListContainer.itemList.get(3));
    sale2.setProduct(arrayListContainer.itemList.get(4));
    arrayListContainer.saleList.add(sale2);

    Sale sale3 = new Sale();
    sale3.date = "2021-01-02";
    sale3.client = arrayListContainer.userList.get(0);
    sale3.getProductList().add(arrayListContainer.itemList.get(1));
    sale3.getProductList().add(arrayListContainer.itemList.get(2));
    arrayListContainer.saleList.add(sale3);

    Sale sale4 = new Sale();
    sale4.date = "2021-01-02";
    sale4.client = arrayListContainer.userList.get(3);
    sale4.getProductList().add(arrayListContainer.itemList.get(0));
    sale4.getProductList().add(arrayListContainer.itemList.get(1));
    sale4.getProductList().add(arrayListContainer.itemList.get(2));
    sale4.getProductList().add(arrayListContainer.itemList.get(3));
    sale4.getProductList().add(arrayListContainer.itemList.get(4));
    sale4.getProductList().add(arrayListContainer.itemList.get(5));
    arrayListContainer.saleList.add(sale4);
  }
}
