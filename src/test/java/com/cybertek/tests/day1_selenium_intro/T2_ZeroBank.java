package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBank {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2-go to http...
        driver.get("http://zero.webappsecurity.com/login.html");

        //locate the link and store inside of WebElememnt

        //3-driver.findElement(By.className("brand"));//to be able to reuse this line store this into WebElement
        WebElement zeroBankLink= driver.findElement(By.className("brand"));
        //verify link text from top left:
        //expected: "Zero Bank"

        String expectedLinkText="Zero Bank";
        String actualLinkText= zeroBankLink.getText();//here we reused the line 21.
        if(actualLinkText.equals(expectedLinkText)){
            System.out.println("passed!");
        }else{
            System.out.println("failed!");
        }
        //4-verify link href attribute value contains:
        //expected= "index.html"

        String expectedAttributeValue= "index.html";
        String actualAttributeValue= zeroBankLink.getAttribute("href");
       // System.out.println(actualAttributeValue);
        if(actualAttributeValue.contains(expectedAttributeValue)){
            System.out.println("passed!");
        }else{
            System.out.println("failed!");
        }


    }
}
