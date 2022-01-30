package com.cybertek.OfficeHours.OH_day01;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MoneyGamingTask {

    @Test
    public void Task1 (){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //lets handle time delays
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // navigate to : https://moneygaming.qa.gameaccount.com/
        driver.get("https://moneygaming.qa.gameaccount.com/");
        //click to JOIN NOW button to open the registrateion page
        WebElement joinNowButton= driver.findElement(By.xpath("//a[.='Join Now!']"));
        joinNowButton.click();
        //select a title value from the dropdown
        WebElement titleElement= driver.findElement(By.id("title"));
        //we need to create our select object so we can reach elect class methods
        Select titledRopDownMenu= new Select(titleElement);
        //we are going add Mr to gaming
        titledRopDownMenu.selectByVisibleText("Mr");
        //verify that Mr is selected
        String expectedTitle= "Mr";
        String actualTitle=titledRopDownMenu.getFirstSelectedOption().getText();
        Assert.assertEquals(actualTitle,expectedTitle, "verify the title");
        //enter your first name lastname in the form
        WebElement name= driver.findElement(By.xpath("//input[@name='map(firstName)']"));
        name.sendKeys("semiha");
        WebElement lastname= driver.findElement(By.xpath("//input[@name='map(lastName)']"));
        lastname.sendKeys("yildiz");
        //check the tcikbox with text 'I accetp...'
        WebElement tickBox= driver.findElement(By.xpath("//input[@id='checkbox']"));
        tickBox.click();
        //submit the form by clicking the JOIN NOW button
        WebElement submitButton= driver.findElement(By.xpath("//input[@id='form']"));
        submitButton.click();
        //validate that a validation message with text ' this fields is required' appears under the dat of birth

        WebElement requiredText= driver.findElement(By.xpath("//label[@for='dob']"));
        String expectedError="This field is required";
        String actualError= requiredText.getText();
        Assert.assertEquals(actualError,expectedError,"verify error");



    }
}
