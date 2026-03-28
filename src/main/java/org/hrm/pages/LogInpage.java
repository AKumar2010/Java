package org.hrm.pages;


import org.hrm.Locators.LogInLocators;
import org.openqa.selenium.WebDriver;


public class LogInpage {
    LogInLocators locators;

    public LogInpage(WebDriver driver){
        locators=new LogInLocators(driver);
    }

    public void doLogIn(String id,String pass){
        locators.getUserName().sendKeys(id);
        locators.getPassword().sendKeys(pass);
        locators.getButton().click();

    }

    public boolean isSearchButton(){
        return locators.SearchButton().isEnabled();
    }

}
