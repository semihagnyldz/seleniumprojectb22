package com.cybertek.tests.day8_windows_javafaker;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MultipleWindowsPractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //Create new test and make set ups
        //2. Go to : https://www.amazon.com
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");


    }

    @Test
    public void multiple_window_test(){
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
        //3. Copy paste the lines from below into your class

        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            System.out.println("title in current page: "+driver.getTitle());
            if(driver.getTitle().contains("Etsy")){
                Assert.assertTrue(driver.getTitle().contains("Etsy"));
                break;
            }


        }


        //4. Create a logic to switch to the tab where Etsy.com is open
        //5. Assert: Title contains “Etsy”

    }
}

