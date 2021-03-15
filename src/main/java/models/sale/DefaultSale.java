package models.sale;

import container.ArrayItem;
import container.ArraySale;
import container.ArrayUser;

public class DefaultSale {

  public static void defaultSale(){

    Sale sale1 = new Sale();
    sale1.date = "2021-01-01";
    sale1.client = ArrayUser.getInstanceUserList().get(1);
    sale1.setProduct(ArrayItem.getInstanceItemList().get(1));
    sale1.setProduct(ArrayItem.getInstanceItemList().get(2));
    ArraySale.getInstance().add(sale1);

    Sale sale2 = new Sale();
    sale2.date = "2021-01-01";
    sale2.client = ArrayUser.getInstanceUserList().get(2);
    sale2.getProductList().add(ArrayItem.getInstanceItemList().get(3));
    sale2.getProductList().add(ArrayItem.getInstanceItemList().get(4));
    ArraySale.getInstance().add(sale2);

    Sale sale3 = new Sale();
    sale3.date = "2021-01-02";
    sale3.client = ArrayUser.getInstanceUserList().get(0);
    sale3.getProductList().add(ArrayItem.getInstanceItemList().get(1));
    sale3.getProductList().add(ArrayItem.getInstanceItemList().get(2));
    ArraySale.getInstance().add(sale3);

    Sale sale4 = new Sale();
    sale4.date = "2021-01-02";
    sale4.client = ArrayUser.getInstanceUserList().get(3);
    sale4.getProductList().add(ArrayItem.getInstanceItemList().get(0));
    sale4.getProductList().add(ArrayItem.getInstanceItemList().get(1));
    sale4.getProductList().add(ArrayItem.getInstanceItemList().get(2));
    sale4.getProductList().add(ArrayItem.getInstanceItemList().get(3));
    sale4.getProductList().add(ArrayItem.getInstanceItemList().get(4));
    sale4.getProductList().add(ArrayItem.getInstanceItemList().get(5));
    ArraySale.getInstance().add(sale4);
  }
}
