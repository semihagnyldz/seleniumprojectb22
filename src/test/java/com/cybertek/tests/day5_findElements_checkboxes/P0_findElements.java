package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P0_findElements {
    public static void main(String[] args) {
        //1-open chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //if web elements is not found this will wait up to 15 seconds
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //2-GO TO http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //3-print out the texts of all links
        //we need to create a locator that returns us all the links on the page
        // //body//a this will return all the links from the page
        //driver.findElements(By.xpath("//body//a")); //store this
        //we are storing all of the links that are returned by findElements method.
        List<WebElement> listOfLinks= driver.findElements(By.xpath("//body//a"));
        //printing:

        for (WebElement each : listOfLinks) {
           // System.out.println(each); bu sekilde linklerin texti vermior
            System.out.println(each.getText());


        }

        //4-print out how many links there are
        //System.out.println(listOfLinks.size()); or
        int numberOfLinks= listOfLinks.size();
        System.out.println("numberOfLinks = " + numberOfLinks);


    }
}
