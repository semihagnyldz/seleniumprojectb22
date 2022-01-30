package com.cybertek.tests.Homework.day5_homeworks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class facebook2 {
    public static void main(String[] args) throws InterruptedException {
        //Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // 2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
        // 3.Enter incorrect username
        WebElement userName= driver.findElement(By.xpath("//input[@type='text']"));

        userName.sendKeys("wrong username"+ Keys.ENTER);
        // 4.Enter incorrect password
        Thread.sleep(4000);
        WebElement passWord= driver.findElement(By.xpath("//input[@type='password']"));
        passWord.sendKeys("wrong password"+Keys.ENTER);

        // 5.Verify title changed to: Expected: “Log into Facebook”
        String actualTitle= driver.getTitle();
        String expectedTitle= "Log into Facebook";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("passed!");
        }else{
            System.out.println("failed!");
        }

    }
}
