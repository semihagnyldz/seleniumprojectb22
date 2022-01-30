package com.cybertek.tests.Homework.day5_homeworks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC_03 {
    public static void main(String[] args) {
        //TC #03: FINDELEMENTS_APPLE
        // 1.Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 2.Go to https://www.apple.com
        driver.get("https://www.apple.com");
        // 3.Click to all of the headers one by one a.Mac, iPad, iPhone, Watch, TV, Music, Support


        //storing 9 list items including apple and search box but we dont want apple and support headre, we want only mac,...support.
        List<WebElement> headersLinks= driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

        //we dont want the first one and

        for (int eachLink = 1; eachLink < headersLinks.size()-1; eachLink++) {
            System.out.println(headersLinks.get(eachLink).getText());//burda gettext demezsek webelementin
            // tum halini vercek, locate etmis olduk, ama o webelementin text ini istioruz which is the header
            headersLinks.get(eachLink).click(); //this one click the first one only, bc my driver losining its reference
            //we need to restore the webelement:
            headersLinks= driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));


        }
        // 4.Print out the titles of the each page
        System.out.println("current title in the page: "+ driver.getTitle()); //BURAYI ANLAMADIM!

        // 5.Print out total number of links in each page
        List<WebElement> allLinks= driver.findElements(By.xpath("//body//a"));
        System.out.println("total number of links in the current page: "+allLinks.size());
        int linksWithNoText=0;
        int linksWithText=0;

        for (WebElement each : allLinks) {
            if(each.getText().isEmpty()) {
                linksWithNoText++;
            }else{
                linksWithText++;
            }
        }
        // 6.While in each page:
        // a.Print out how many link is missing textTOTAL
        System.out.println("links with NO text: "+linksWithNoText);


        // b.Print out how many link has textTOTAL
        System.out.println("links with text: "+linksWithText);
    }
}
