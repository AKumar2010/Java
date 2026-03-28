package org.hrm.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogInLocators {
    WebDriver driver;
    public LogInLocators(WebDriver driver){
        this.driver=driver;
    }
    public WebElement getUserName(){
        WebElement id=driver.findElement(By.xpath("//input[@name='username']"));
        return id;
    }

    public WebElement getPassword(){
        WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
        return pass;
    }

    public WebElement getButton(){
        WebElement btn=driver.findElement(By.xpath("//button[@type='submit']"));
        return btn;
    }

    public WebElement SearchButton(){
        WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement srchbtn=driver.findElement(By.xpath("//input[@placeholder='Search']"));
        wt.until(ExpectedConditions.visibilityOf(srchbtn));
        return srchbtn;
    }

}
