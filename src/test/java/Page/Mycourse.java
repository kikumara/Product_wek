package Page;

import Setup.Utility_methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mycourse extends Utility_methods {
    public Mycourse(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath ="//*[@id=\"root\"]/div/div[1]/div[2]/a[3]")
    WebElement Course;

    public void course_click() {
        click(Course);

    }
    @FindBy(xpath ="//*[@id=\"root\"]/div/div[2]/div/div[5]/div/div[1]")
    WebElement PythonVideo;

    public void python_click() {
        click(PythonVideo);

    }
    @FindBy(xpath ="//button[@class='btn certificate-generator']")
    WebElement Certificate;

    public void certificate_click() {
        click(Certificate);

    }

}
