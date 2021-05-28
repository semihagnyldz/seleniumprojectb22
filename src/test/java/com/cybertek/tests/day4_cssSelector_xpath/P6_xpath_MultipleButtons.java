package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_xpath_MultipleButtons {
    public static void main(String[] args) {
        //. Open Chrome browser

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // 2. Go to http://practice.cybertekschool.com/multiple_buttons
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        // 3. Click on Button 1
       //1st way: but not very effective, it will return you the first button, if there are any others, you will have problem finding them.
        // WebElement button1= driver.findElement(By.xpath(//button]@class='btn btn-primary']));
        //2nd way:
        //WebElement button1= driver.findElement(By.xpath("//button[@onclick='button1()']"));// using onclick attiruvute value
        //3rd way:
        WebElement button1= driver.findElement(By.xpath("//button[.='Button 1']")); //IF YOU WANNA USE TEXT, start with . and the text
        button1.click();


        WebElement resultText= driver.findElement(By.xpath("//p[@id='result']"));
        // 4. Verify text displayed is as expected:
        // Expected:“Clicked on button one!”
        String expectedText="Clicked on button one!";
        String actualText= resultText.getText();// getText methodu icin findElement yapman lazim.
        if(actualText.equals(expectedText)){
            System.out.println("passed!");
        }else{
            System.out.println("failed!");
        }
    }
}
