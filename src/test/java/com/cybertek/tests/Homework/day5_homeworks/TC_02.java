package com.cybertek.tests.Homework.day5_homeworks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC_02 {
    public static void main(String[] args) {
        //TC #02: FINDELEMENTS_APPLE
        // 1.Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // 2.Go to https://www.apple.com
        driver.get("https://www.apple.com");
        // 3.Click to iPhone
        WebElement iPhone= driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']"));
        iPhone.click();
        // 4.Print out the texts of all links
        List<WebElement> allTheLinks= driver.findElements(By.xpath("//body//a"));

        for(WebElement eachTexts:allTheLinks ){
            System.out.println(eachTexts.getText());
        }
        // 5.Print out how many link is missing text
        for(WebElement missingLinks: allTheLinks){
           // if(!missingLinks.)
        }
        // 6.Print out how many link has text
        // 7.Print out how many total link
    }
}
