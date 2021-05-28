package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearchVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(); //creating driver instance/object
        driver.manage().window().maximize();

        //before the do any action we need to do: inspect

        //2- go to : https://google.com
        driver.get("https:/www.google.com");
        //3- write "apple" in search box:
        //4-click enter button (keys.Enter)
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);
        //5- cerify title:
        //expected: title should start with "apple" word
        String expectedInTitle="apple";
        String actualTitle= driver.getTitle();

        if(actualTitle.startsWith(expectedInTitle)){
            System.out.println("title verification passed!");
        }else{
            System.out.println("title verification failed!");
        }





    }
}
