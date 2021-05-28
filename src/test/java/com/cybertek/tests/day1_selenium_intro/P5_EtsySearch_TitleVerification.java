package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_EtsySearch_TitleVerification {
    public static void main(String[] args) throws InterruptedException {
        //1-OPEN CHrome BROWSER
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

       //2-GO TO : HTTPS://WWW.ETSY.COM
        driver.get("https://www.etsy.com");

        //3-search for wooden spoon: TO BE ABLE TO Search WE NEED TO LOCATE FIRST
        // 1-NEED TO LOCATE THE SEARCH BAR
        //2-WE ENTER SEARCH VALUE
        //3-WE PRESS ENTER
        driver.findElement(By.id("global-enhancements-search-query"))//1-LOCATING SEarch BAR
                .sendKeys("wooden spoon"+ Keys.ENTER); //HERE 2 AND 3 HAPPENING IN 1 LINE
        //verify title:
        //expected: "Wooden spoon | Etsy"

        String expectedTitle= "Wooden spoon | Etsy";
        System.out.println(expectedTitle);

        Thread.sleep(3000);
        String actualTitle= driver.getTitle();
        System.out.println(actualTitle);
        if(actualTitle.equals(expectedTitle)){
            System.out.println("passed!");
        }else{
            System.out.println("failed!");
        }


    }
}
