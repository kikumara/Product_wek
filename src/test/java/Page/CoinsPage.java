package Page;

import Setup.Utility_methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoinsPage extends Utility_methods {
    public CoinsPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[2]/a[2]")

    WebElement coins;

    public void coin_click(){
        click(coins);
    }

    @FindBy(xpath = "//button[@class='ui primary button']")
    WebElement Redeem;

    public void redeem_click(){
        click(Redeem);

    }

}
