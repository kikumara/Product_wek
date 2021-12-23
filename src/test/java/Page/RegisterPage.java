package Page;

import Setup.Utility_methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility_methods {
    public RegisterPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="(//a[@href='/signup'])[1]")
    public WebElement register;
    public void register_click()
    {
        click(register);
    }
    @FindBy(xpath="//input[@placeholder='Username....']")
    WebElement username;
    public void Enter_username(String value){
        Enter_the_value(username, value);
    }

    @FindBy(xpath="//input[@placeholder='First Name']")
    WebElement Firstname;
    public void Enter_Firstname(String value){
        Enter_the_value(Firstname, value);
    }

    @FindBy(xpath="//input[@placeholder='Last Name']")
    WebElement Lastname;
    public void Enter_Lastname(String value){
        Enter_the_value(Lastname, value);
    }

    @FindBy(xpath="//input[@placeholder='abc@gmail.com']")
    WebElement Mail;
    public void Enter_Mail(String value){
        Enter_the_value(Mail, value);
    }

    @FindBy(xpath="//input[@placeholder='0123456789']")
    WebElement Mobile;
    public void Enter_Mobile(String value){
        Enter_the_value(Mobile, value);
    }

    @FindBy(xpath="//input[@placeholder='*****']")
    WebElement password;
    public void Enter_Password(String value){
        Enter_the_value(password, value);
    }
    @FindBy(name="role")
    WebElement Radio_button_student;

    public void click_student(){
        click(Radio_button_student);
    }

    @FindBy(xpath="//button[text()='Sign Up']")
    WebElement signup_button_click;
    public void click_Signup_button(){
        click(signup_button_click);
    }


}



