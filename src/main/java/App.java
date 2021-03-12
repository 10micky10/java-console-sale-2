import models.user.DefaultUser;
import views.login.LoginMenu;
import views.mainmenu.MainSwitch;

public class App {
	public static void main(String[] args) {
    DefaultUser.defaultUser();
    LoginMenu.showLoginMenu();
    MainSwitch.show();
	}
}
