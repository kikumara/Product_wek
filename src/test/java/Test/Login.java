package Test;

import Page.LoginPage;
import Setup.Broser_Setup;
import Setup.Utility_methods;
import org.testng.annotations.Test;

import java.io.IOException;

public class Login extends Broser_Setup {
    @Test
    public void login() throws IOException {
        LoginPage log=new LoginPage(driver);
        log.login_click();
        String Username= Utility_methods.test_Configuration("username");
        log.Enter_username(Username);
        String Password=Utility_methods.test_Configuration("password");
        log.Enter_password(Password);
        log.loginbutton_click();
    }

}
