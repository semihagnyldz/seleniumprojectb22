package com.cybertek.tests.Homework.day5_homeworks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class facebook1 {
    public static void main(String[] args) throws InterruptedException {
        //Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver. manage().window().maximize();
        // 2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
        // 3.Verify title: Expected: “Facebook -Log In or Sign Up”
        String actualTitle= driver.getTitle();
        String expectedTitle= "Facebook - Log In or Sign Up";
        if (expectedTitle.equals(actualTitle)) {

            System.out.println("passed!");
        }else{
            System.out.println("failed!");
        }
        Thread.sleep(5000);
        driver.close();
    }
}
