package Test;

import Page.BuyCoins_Student;
import Page.CoinsPage;
import Page.LoginPage;
import Setup.Broser_Setup;
import Setup.Utility_methods;
import org.testng.annotations.Test;

import java.io.IOException;

public class Buy_Coins_Student_test extends Broser_Setup {

    @Test
    public void Coins_Student() throws IOException {
        BuyCoins_Student bs=new BuyCoins_Student(driver);
        LoginPage log=new LoginPage(driver);
        log.login_click();
        String username= Utility_methods.test_Configuration("username");
        String password= Utility_methods.test_Configuration("password");
        log.Enter_username(username);
        log.Enter_password(password);
        log.loginbutton_click();
        bs.buyCoins_Click();
     //   bs.buy100_click();
       // bs.buy200_click();
        //bs.buy600_click();
        //bs.remove100_click();
        //bs.remove200_click();
        //bs.remove600_click();
        //bs.checkout_click();

    }
    }

