package Test;

import Page.LoginPage;
import Page.Logout;
import Page.Mycourse;
import Setup.Broser_Setup;
import Setup.Utility_methods;
import org.testng.annotations.Test;

import java.io.IOException;

public class Logout_Test extends Broser_Setup {

    @Test
    public void logout() throws IOException, InterruptedException {
        Logout logout = new Logout(driver);
        LoginPage log = new LoginPage(driver);
        log.login_click();
        String username = Utility_methods.test_Configuration("username");
        String password = Utility_methods.test_Configuration("password");
        log.Enter_username(username);
        log.Enter_password(password);
        log.loginbutton_click();
        Thread.sleep(3000);
        logout.logout_click();

    }
}
