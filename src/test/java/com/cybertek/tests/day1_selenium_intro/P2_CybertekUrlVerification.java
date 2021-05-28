package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekUrlVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        //. Open Chrome browser
        WebDriver driver= new ChromeDriver();

        //maximize the page
        driver.manage().window().maximize();

        //2. Go to https://practice.cybertekschool.com
        driver.get("https://practice.cybertekschool.com/");

        //3. Verify URL contains
        //Expected: cybertekschool
        String expectedUrl="cybertekschool";
        //4. Verify title:
        String actualUrl= driver.getCurrentUrl();
        // Expected: Practice
       if(actualUrl.contains(expectedUrl)){
           System.out.println("url passed");
       }else{
           System.out.println("url failed");
       }

       String expectedTitle="Practice";
       String actualTitle=driver.getTitle();
       if(actualTitle.equals(expectedTitle)){
           System.out.println("title passed");
       }else{
           System.out.println("title failed");
       }
    }
}
