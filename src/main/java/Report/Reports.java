package Report;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.io.IOException;

public class Reports {

        private final Object ExtentHtmlReporter = null;
        @Test
        public void FileuploaderTest() throws IOException
        {
            System.out.println("upload file");
            com.aventstack.extentreports.reporter.ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/automation.html");
            ExtentReports extent=new ExtentReports();
            extent.attachReporter((ExtentReporter) reporter);
            ExtentTest logger=extent.createTest("FileuploaderTest");
            logger.log(Status.INFO,"upload file");
            logger.log(Status.PASS,"upload file");
            extent.flush();
            ExtentTest logger1=extent.createTest("FilenotuploadTest");
            logger1.log(Status.FAIL,"upload file");
            logger1.fail("Failed because of some issues", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\supriya4\\Pictures\\Screenshots.jpg").build());
            extent.flush();
        }
}
