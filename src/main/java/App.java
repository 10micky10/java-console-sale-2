import models.item.DefaultItem;
import models.sale.DefaultSale;
import models.user.DefaultUser;
import views.login.LoginMenu;
import views.mainmenu.MainSwitch;

public class App {
  public static void main(String[] args) {
    DefaultUser.defaultUser();
    DefaultItem.getDefaultItem();
    DefaultSale.defaultSale();
    LoginMenu.showLoginMenu();
    MainSwitch.show();
  }
}
