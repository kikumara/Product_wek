package Page;

import Setup.Utility_methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile extends Utility_methods {

    public Profile(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath ="//*[@id=\"root\"]/div/div[1]/div[2]/a[5]")
    WebElement Profile;

    public void course_click() {
        click(Profile);

    }
    @FindBy(xpath ="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/label")
    WebElement Upload;

    public void upload_click() {
        click(Upload);

    }
    @FindBy(xpath ="//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/form[1]/div[6]/button")
    WebElement Edit;

    public void edit_click() {
        click(Edit);

    }


}
