package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_CybertekTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/inputs");

        //click "Home" button: link locator also can be used here bc home is the link.but we will use classname locator example here
        //to be able to clcik "home"  button
        // first locate:
        //second: click
        driver.findElement(By.className("nav-link")).click();

        //verify title as expected: Practice
        String expectedTitle="Practice";
        String actualTitle=driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
    }
}
