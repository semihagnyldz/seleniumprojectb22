package com.cybertek.utilities;
/*
Task: new method creation
method name: getDriver
static method
accepts strings arg:browserType
THIS ARg WILL DETERMINE WHAT TYPE OF BROWSER IS OPENED
IF "chrome" passed--- it will open chrome browser
if "firefox" passed--it will open firefox browser
return type:"WebDriver"
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public static WebDriver getDriver(String browserType){ //static: don't need te create a object to be able call the method.
       // WebDriver driver; gerek yok asagi retur yaz yeter!
        if(browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        }else if(browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();

        }else{
            System.out.println("not valid!");
            return null;
        }
    }

}
