package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerification {
    public static void main(String[] args) {
        //this lesson: there are 8 locator, you can use either one!
        //===================================================


        //1-open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        //2-go to: https://google.com
        driver.get("https://www.google.com");
        //3-click to gmail from top right
        driver.findElement(By.linkText("Gmail")).click();//locating and clicking the element
        //4-verify title contains:
        //expected : Gmail
        String expectedInTitle= "Gmail";
        String actualTitle= driver.getTitle();
        if(actualTitle.contains(expectedInTitle)){ //cant not right expectedTtitle.contains(actualTitle) bc actaultitle is the longer one
            System.out.println("title verification passed!");
        }else{
            System.out.println("title verification not passed!");
            //control+D: multiplies the current line
            //moving the line up and down:control+shift+up/down arrow
        }
            System.out.println("title verification not passed!");

        //paRtialLinkText:
        driver.findElement(By.partialLinkText("mail")); //dediginde gmaili bulcak bc gmail mail icerio



        //5-go back to Google by using the .back();
        //expected: Google




    }
}
