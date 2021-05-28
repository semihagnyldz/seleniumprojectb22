package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_WebOrdersLogin {
    public static void main(String[] args) {
        //Open a chrome browser
      //  WebDriverManager.chromedriver().setup();
        //WebDriver driver= new ChromeDriver();
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // 2-Go to: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        // 3-Verify title equals:Expected: Web Orders Login

        String expectedTitle="Web Orders Login";
        String actualTitle=driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("passed!");
        }else{
            System.out.println("failed!");
        }
        // 4-Enter username: Tester
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        // 5-Enter password: test
        WebElement password= driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        // 6-Click “Sign In” button
        WebElement signIn= driver.findElement(By.id("ctl00_MainContent_login_button"));
        signIn.click();
        // 7-Verify titleequals:
        // Expected: Web Orders
        String titleAfterLogIn= "Web Orders";
        String actualaHomePageTitle= driver.getTitle();
        if(titleAfterLogIn.equals(actualaHomePageTitle)){
            System.out.println("passed!");
        }else{
            System.out.println("failed!");
        }
    }
}
