package Test;

import Page.RegisterPage;
import Setup.Broser_Setup;
import Setup.Utility_methods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Register extends Broser_Setup {
    @Test
    public void reg() throws IOException, InterruptedException {
     //   driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

        RegisterPage reg=new RegisterPage(driver);
        reg.register_click();
        String Username=Utility_methods.test_Configuration("username");
        reg.Enter_username(Username);
        String Firstname= Utility_methods.test_Configuration("firstname");
        reg.Enter_Firstname(Firstname);
        String Lastname=Utility_methods.test_Configuration("lastname");
        reg.Enter_Lastname(Lastname);
        String Email=Utility_methods.test_Configuration("mail");
        reg.Enter_Mail(Email);
        String Mobile=Utility_methods.test_Configuration("mobile");
        reg.Enter_Mobile(Mobile);
        String Password=Utility_methods.test_Configuration("password");
        reg.Enter_Password(Password);
        Thread.sleep(3000);
        //Actions act=new Actions(driver);
        //act.sendKeys(Keys.PAGE_DOWN).build().perform();
        //act.sendKeys(Keys.PAGE_DOWN).build().perform();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("arguments[0].scrollIntoView();", element);
        js.executeScript("window.scrollBy(0,1050)", "");
        Thread.sleep(3000);
        reg.click_student();
        reg.click_Signup_button();
    }
}

