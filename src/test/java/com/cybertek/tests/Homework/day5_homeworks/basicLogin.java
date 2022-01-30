package com.cybertek.tests.Homework.day5_homeworks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class basicLogin {
    public static void main(String[] args) throws InterruptedException {
        //Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // 2-Go to: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        // 3-Verify title equals:Expected: Web Orders Login
        String actualTitle=driver.getTitle();
        String expectedTitle="Web Orders Login";
        if(expectedTitle.equals(actualTitle)){
            System.out.println("passed!");
        }else{
            System.out.println("failed!");
        }
        // 4-Enter username: Tester
        WebElement username= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        username.sendKeys("Tester"+ Keys.ENTER);

        // 5-Enter password: test
        WebElement password= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        password.sendKeys("test"+Keys.ENTER);
        // 6-Click “Sign In” button
        WebElement signIn= driver.findElement(By.xpath("//input[@type='submit']"));
        signIn.click();
        // 7-Verify titleequals:Expected: Web Orders
        String actualTitleAfterLogin= driver.getTitle();
        String expectedTitleAfterLogin= "Web Orders";
        if(actualTitleAfterLogin.equals(expectedTitleAfterLogin)){
            System.out.println("passed1");
        }else{
            System.out.println("failed");
        }
        Thread.sleep(3000);

    }
}
