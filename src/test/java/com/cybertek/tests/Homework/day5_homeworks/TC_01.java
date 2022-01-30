package com.cybertek.tests.Homework.day5_homeworks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC_01 {
    public static void main(String[] args) {
        //Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        // 2.Go to https://www.merriam-webster.com/
        driver.get("https://www.merriam-webster.com/");
        driver.manage().window().maximize();
        // 3.Print out the texts of all links
      List<WebElement> allTheLinks= driver.findElements(By.xpath("//body//a"));
        // 4.Print out how many link is missing text
        for(WebElement each: allTheLinks){
            System.out.println(each);
            // 5.Print out how many link has text
            System.out.println(each.getText());
            // 6.Print out how many total link
            System.out.println(allTheLinks.size());

        }




    }
}
