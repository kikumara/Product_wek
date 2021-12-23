package Test;

import Page.CoinsPage;
import Page.LoginPage;
import Page.Mycourse;
import Setup.Broser_Setup;
import Setup.Utility_methods;
import org.testng.annotations.Test;

import java.io.IOException;

public class Mycourse_testcase extends Broser_Setup {

    @Test
    public void course() throws IOException {
        Mycourse mc = new Mycourse(driver);
        LoginPage log = new LoginPage(driver);
        log.login_click();
        String username = Utility_methods.test_Configuration("username");
        String password = Utility_methods.test_Configuration("password");
        log.Enter_username(username);
        log.Enter_password(password);
        log.loginbutton_click();
        mc.course_click();
        mc.python_click();
        mc.certificate_click();
    }
}
