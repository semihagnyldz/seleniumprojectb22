package com.cybertek.tests.Homework.day5_homeworks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class multipleButtons {
    public static void main(String[] args) {
        //Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // 2. Go to http://practice.cybertekschool.com/multiple_buttons
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        // 3. Click on Button 1
        WebElement button1= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        button1.click();
        // 4. Verify textdisplayed is as expected:Expected:“Clicked on button one!”
        WebElement textDisplayed= driver.findElement(By.xpath("//p[@id='result']"));
        String actualText= textDisplayed.getText();
        String expectedText= "Clicked on button one!";
        if(actualText.equals(expectedText)){
            System.out.println("text verification passed!");
        }else{
            System.out.println("text verification failed!");
        }
    }
}
