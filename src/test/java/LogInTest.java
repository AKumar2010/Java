import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.hrm.pages.LogInpage;
import org.testng.Assert;
import org.testng.annotations.Test;

@Slf4j
public class LogInTest extends BaseTest{


    @Test
    void validateLogIn(){
        LogInpage page=new LogInpage(driver);
        page.doLogIn("Admin","admin123");
        //log.info("search btn text: "+page.searchButton());
        Assert.assertTrue(page.isSearchButton(),"Search glass not there");
    }



}
