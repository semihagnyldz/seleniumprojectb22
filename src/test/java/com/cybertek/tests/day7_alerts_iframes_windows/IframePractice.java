package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframePractice {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //Create a new class called: IframePractice
        //2. Create new test and make set ups


        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //3. Go to: http://practice.cybertekschool.com/iframe
        driver.get("http://practice.cybertekschool.com/iframe");



    }
    @Test
    public void iframe_test(){
        //before locating the web element, we have to switch our driver focus to iframe:
        //#1this changing to iframe by index: we pass index number
        //driver.switchTo().frame(0); //i tane iframe vardi, oyuzden index 0 oluo.
        //#2 locate it as web element:
       // driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        //#3 if <iframe> tag has id or name attribute, we can pass its attribute value as a string info:
        driver.switchTo().frame("mce_0_ifr");//this is id value.


        //4. Assert: “Your content goes here.” Text is displayed.

        WebElement yourContentGoesHereText= driver.findElement(By.xpath("//p"));
        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor
        //this above text outside of iframe so need to change the driver's focus back to normal:
        driver.switchTo().parentFrame(); //or driver.switchTo().defaultContent();


        //locating header as web element
        WebElement headerText= driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(headerText.isDisplayed());
    }
}
