package Test;

import Page.CoinsPage;
import Page.CoinsStudent;
import Page.LoginPage;
import Setup.Broser_Setup;
import Setup.Utility_methods;
import org.testng.annotations.Test;

import java.io.IOException;

public class Coins_Student_testcase extends Broser_Setup {
    @Test
    public void Coins() throws IOException {
        CoinsStudent cst = new CoinsStudent(driver);
        LoginPage log = new LoginPage(driver);
        log.login_click();
        String username = Utility_methods.test_Configuration("username");
        String password = Utility_methods.test_Configuration("password");
        log.Enter_username(username);
        log.Enter_password(password);
        log.loginbutton_click();
        cst.wallet_click();

    }
}