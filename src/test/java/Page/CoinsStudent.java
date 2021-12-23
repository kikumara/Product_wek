package Page;

import Setup.Utility_methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoinsStudent extends Utility_methods {
    public CoinsStudent(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="//a[@class='button']")
    WebElement Wallet;

    public void wallet_click() {
        click(Wallet);

    }
}
