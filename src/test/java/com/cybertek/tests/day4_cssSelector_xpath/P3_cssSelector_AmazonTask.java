package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_cssSelector_AmazonTask {
    public static void main(String[] args) {
        //TC #3: Amazon link number verification
        // 1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // 2. Go to https://www.amazon.com
        driver.get("https://www.amazon.com");

        // 3. Enter search term (use cssSelectorto locate search box)
        WebElement amazonSearchBar= driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));

        amazonSearchBar.sendKeys("wooden spoon"+ Keys.ENTER);

        // 4. Verify title equals search term

        String expectedTitle="Amazon.com : wooden spoon";
        String actualTitle= driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("passed!");
        }else{
            System.out.println("failed!");
        }


    }
}
