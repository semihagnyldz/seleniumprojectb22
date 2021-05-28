package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_practice {
    public static void main(String[] args) {
        //what is selenium: is a set of jar files that help us automate browsers. we use these jar files to automate test cases on web application/pages.
        //what is jar (java archive) file?: bunch of ready classes and methods.
        //what is maven?: a build automation tool.helps us automate project creation and management.
        //is maven for testers? NO. for developers.
        /*
        when we create a project with maven following things happen:
        1. project comes with existing folder structure.: SRC: main-developers writes the actual code, test: unit test goes here
        2. pom.xml(read as pomxml) file is created.

         */
        //1.setup browser driver:
        WebDriverManager.chromedriver().setup();
        //open chrome browser:
        WebDriver driver= new ChromeDriver();

        //maximize browser
        driver.manage().window().maximize();

        //go to http://www.yahoo.com
        driver.get("https://www.yahoo.com");

        //verify title:
        //expected: Yahoo. you will get this expected value from our documentations. po our business analysiss. like:
        String expectedTitle="Yahoo";

        //actual value wil, be gotten from the browser!:
        driver.getTitle();
        String actualTitle= driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title is as expected. Verification PASSES!");
        }else{
            System.out.println("test failed");
        }
        //CLOSING THE BROWSER:
        driver.close();
        /*
        some notes:
        difference between selenium webdriver and browser driver:
        selenium webdriver: is the name of the tool
        browser driver:
         */

    }
}
