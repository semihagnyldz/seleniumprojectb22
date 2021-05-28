package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_ZeroBank {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //go to http...
        driver.get("http://zero.webappsecurity.com/login.html");

        //verify header text
        //expected: "Log in to ZeroBank"
        String expectedHeader= "Log in to ZeroBank";
        //locate the web element
        //get the text of it using getText() method

        String actualHeaderText=driver.findElement(By.tagName("h3")).getText();//we store our web element  into string bc
        if(actualHeaderText.equals(expectedHeader)){
            System.out.println("passed!");
        }else{
            System.out.println("failed!");
        }

        //whenever you use findElement store it
       // WebElement actualHeader= driver.findElement(By.tagName("h3"));

    }
}
