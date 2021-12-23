package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class Broser_Setup {

    public WebDriver driver;
    @BeforeClass
    public void launch() throws IOException, IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kikumara\\Downloads\\chromedriver.exe");
        driver=new ChromeDriver();
        String url= Utility_methods.test_Configuration("AppUrl");
        driver.get(url);
        driver.manage().window().maximize();
    }
  /*  @AfterClass
    public void close(){
        driver.close();
    }*/
}


