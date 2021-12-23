package Setup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility_methods {
    public static void Enter_the_value(WebElement element, String value) {
        element.sendKeys(value);
    }

    //to click on webelement
    public static void click(WebElement element) {
        element.click();
    }

    //select value from list using text
    public static void select_by_text(WebElement ele,String txt)
    {
        Select sel=new Select(ele);
        sel.selectByVisibleText(txt);
    }

    //select value from list using value
    public static void select_by_value(WebElement ele,String txt)
    {
        Select sel=new Select(ele);
        sel.selectByValue(txt);
    }

    //select value from list using index
    public static void select_by_index(WebElement ele,int index)
    {
        Select sel=new Select(ele);
        sel.selectByIndex(index);
    }
    //test configuration method
    public static String test_Configuration(String key ) throws IOException {
        String filepath="./Test_Configuration/Config.properties";
        FileInputStream fis=new FileInputStream(filepath);
        Properties prop=new Properties();
        prop.load(fis);
        String value=prop.getProperty(key);
        return value;
    }
}



