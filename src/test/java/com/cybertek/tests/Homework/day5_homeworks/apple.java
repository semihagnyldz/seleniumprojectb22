package com.cybertek.tests.Homework.day5_homeworks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class apple {
    public static void main(String[] args) {
        //Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // 2.Go to https://www.apple.com
        driver.get("https://www.apple.com");
        // 3.Click to iPhone
        WebElement iPhone= driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']"));
        iPhone.click();
        // 4.Print out the texts of all links
        List<WebElement> allLinks= driver.findElements(By.xpath("//body//a"));
        for( WebElement eachLink: allLinks){
            System.out.println("total texts of all links: "+eachLink.getText());
        }
        // 5.Print out how many link is missing text
        int linkHasText=0;
        int linkNoText=0;
        for (WebElement text: allLinks) {
            if(text.getText().isEmpty()){
                linkNoText++;
            }else{
                linkHasText++;
            }

        }
        System.out.println("linkNoText = " + linkNoText);
        // 6.Print out how many link has text
        System.out.println("linkHasText = " + linkHasText);

        // 7.Print out how many total link
        System.out.println("total links: "+allLinks.size());
    }
}
