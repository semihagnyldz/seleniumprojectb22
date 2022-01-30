package com.cybertek.tests.Homework.day5_homeworks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class merriam_webster {
    public static void main(String[] args) {
        //1.Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // 2.Go to https://www.merriam-webster.com/
        driver.get("https://www.merriam-webster.com/");
        // 3.Print out the texts of all links
        List<WebElement> allLinks= driver.findElements(By.xpath("//body//a"));
        int linksWithText=0;
        int linksWithNoText=0;
        for(WebElement eachLink:allLinks){
            if(eachLink.getText().isEmpty()){
                linksWithNoText++;
            }else{
                linksWithText++;
            }
        }
        System.out.println("linksWithText = " + linksWithText);
        System.out.println("linksWithNoText = " + linksWithNoText);
        // 4.Print out how many link is missing text
        // 5.Print out how many link has text
        // 6.Print out how many total link
        System.out.println(allLinks.size());

    }
}
