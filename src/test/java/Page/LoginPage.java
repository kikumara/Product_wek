package Page;

import Setup.Utility_methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility_methods {
    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//a[@href='/login']")
    WebElement login;
    public void login_click()
    {
        click(login);
    }
    @FindBy(xpath="//input[@placeholder='Username....']")
    WebElement Username;
    public void Enter_username(String value){
        Enter_the_value(Username, value);
    }
    @FindBy(xpath=("//input[@placeholder='*****']"))
    WebElement password;
    public void Enter_password(String value){
        Enter_the_value(password, value);
    }
    @FindBy(xpath=("//button[@type='submit']"))
    WebElement loginbutton;
    public void loginbutton_click()
    {
        click(loginbutton);
    }

}



