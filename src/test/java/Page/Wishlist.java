package Page;

import Setup.Utility_methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist extends Utility_methods {
    public Wishlist(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath=("//*[@id=\"root\"]/div/div[1]/div[2]/a[4]"))
    WebElement Wishlist;

          public void wishlist_click(){
               click(Wishlist);
            }
    @FindBy(xpath=("//*[@id=\"root\"]/div/div[2]/div/div[4]/div/div/div[2]/div[2]/span"))
    WebElement Enroll;

    public void enroll_click(){
        click(Enroll);
    }

    @FindBy(xpath=("//*[@id=\"root\"]/div/div[1]/div[2]/a[4]"))
    WebElement RemoveWishlist;

    public void removewishlist_click(){
        click(RemoveWishlist);
    }

}
