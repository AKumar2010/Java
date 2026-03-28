import org.hrm.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    String url="https://opensource-demo.orangehrmlive.com/";
    WebDriver driver;

    @BeforeTest
    void beforeTest(){
        driver=DriverManager.launchBrowser();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.of(5, TimeUnit.SECONDS.toChronoUnit()));
    }

    @AfterTest
    void quit(){
        driver.quit();
    }


}
