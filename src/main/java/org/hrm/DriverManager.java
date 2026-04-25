package org.hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    public static WebDriver driver;


    public static WebDriver launchBrowser(){
        System.out.println((System.getProperty("user.dir"))+"/avc");
        System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir"))+"/chromedriver147");
        String browser="chrome";
        if(browser.equalsIgnoreCase("chrome")){
            driver=new ChromeDriver();
        }
        return driver;
    }
}
