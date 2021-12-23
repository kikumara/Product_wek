package Test;

import Page.LoginPage;
import Page.Mycourse;
import Page.Wishlist;
import Setup.Broser_Setup;
import Setup.Utility_methods;
import org.testng.annotations.Test;

import java.io.IOException;

public class Wishlist_test extends Broser_Setup {
    @Test
    public void course() throws IOException {
        Wishlist wc = new Wishlist(driver);
        LoginPage log = new LoginPage(driver);
        log.login_click();
        String username = Utility_methods.test_Configuration("username");
        String password = Utility_methods.test_Configuration("password");
        log.Enter_username(username);
        log.Enter_password(password);
        log.loginbutton_click();
        wc.wishlist_click();
        wc.removewishlist_click();
    }
}
