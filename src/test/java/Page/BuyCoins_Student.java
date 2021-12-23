package Page;

import Setup.Utility_methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyCoins_Student extends Utility_methods {
    public BuyCoins_Student(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//div[@class='navbar']/div[@class='nav-items']/a[@class='item-buy']")

    WebElement buycoins;

public void buyCoins_Click(){
    click(buycoins);

}

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]")
    WebElement Buy100;

    public void buy100_click(){
        click(Buy100);

    }
    @FindBy(xpath = "//label[@for='radio20']")
    WebElement Buy200;

    public void buy200_click(){
        click(Buy200);

    }
    @FindBy(xpath = "//label[@for='radio50']")
    WebElement Buy600;

    public void buy600_click(){
        click(Buy600);

    }
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[3]/div/div[1]/div[3]/button")
    WebElement Remove100;

    public void remove100_click(){
        click(Remove100);

    }
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[3]/div/div[2]/div[3]/button")
    WebElement Remove200;

    public void remove200_click(){
        click(Remove200);

    }
    @FindBy(xpath ="//*[@id=\"root\"]/div/div[2]/div/div[3]/div/div[3]/div[3]/button")
    WebElement Remove600;

    public void remove600_click() {
        click(Remove600);

    }

    @FindBy(xpath ="//button[@class='btn btn-success']")
    WebElement Checkout;

    public void checkout_click() {
        click(Checkout);

    }






}
