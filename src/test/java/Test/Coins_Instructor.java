package Test;

import Page.CoinsPage;
import Page.LoginPage;
import Setup.Broser_Setup;
import Setup.Utility_methods;
import org.testng.annotations.Test;

import java.io.IOException;

public class Coins_Instructor extends Broser_Setup {
    @Test
    public void Coins() throws IOException {
        CoinsPage cp=new CoinsPage(driver);
        LoginPage log=new LoginPage(driver);
        log.login_click();
        String username= Utility_methods.test_Configuration("username");
        String password= Utility_methods.test_Configuration("password");
        log.Enter_username(username);
        log.Enter_password(password);
        log.loginbutton_click();
        cp.coin_click();
        cp.redeem_click();
    }
}
