import models.item.DefaultItem;
import models.user.DefaultUser;
import views.login.LoginMenu;
import views.mainmenu.MainSwitch;

public class App {
	public static void main(String[] args) {
    DefaultUser.defaultUser();
    DefaultItem.getDefaultItem();
    LoginMenu.showLoginMenu();
    MainSwitch.show();
	}
}
