package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownPractices {

    WebDriver driver= WebDriverFactory.getDriver("chrome");
    @BeforeClass
    public void setupClass(){

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values1.Open Chrome browser
        // 2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void tc1_simple_dropdown_test(){

        // 3.Verify “Simple dropdown” default selected value is correct
        // Expected: “Please select an option”
        //first check if it is select or not.
        //locate the webelement
        Select simpleDropDown= new Select (driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentlySelectedOption=  simpleDropDown.getFirstSelectedOption();//this return webelement but wee need text of it
        String textOfCurrentOption=currentlySelectedOption.getText();
        String expectedText="Please select an option";
        Assert.assertTrue(textOfCurrentOption.equals(expectedText));

        // 4.Verify“State selection” default selected value is correctExpected: “Select a State”
        Select stateDropdown= new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String actualStateDropDownText= stateDropdown.getFirstSelectedOption().getText();
        String expectedStateDropDownText="Select a State";
        Assert.assertEquals(actualStateDropDownText,expectedStateDropDownText);

    }

    @Test
    public void tc2_state_dropdown_test() throws InterruptedException {
        //we already handle the first two lines above:
        //TC #2: Selecting state from State dropdown and verifying result
        // 1.Open Chrome browser----------------done above
        // 2.Go to http://practice.cybertekschool.com/dropdown--------------done above
        // 3.Select Illinois
        //locate Select first:
        Select stateDropdown= new Select(driver.findElement(By.xpath("//select[@id='state']")));
        //select illinois first:
        Thread.sleep(2000);
        stateDropdown.selectByVisibleText("Illinois");

        // 4.Select Virginia
        Thread.sleep(2000);
        stateDropdown.selectByValue("VA");
        // 5.Select California
        Thread.sleep(2000);
        stateDropdown.selectByIndex(5);
        // 6.Verify final selected option is California.
        String expectedOptionText= "California";
        String actualOptionText= stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedOptionText,actualOptionText, "this message will be printed out only if assertion fails");
        // Use all Select options.(visible text, value, index)

    }

    @Test
    public void tc3_selectDate_dropdown_test(){
        //TC #3: Selecting date on dropdown and verifying
        // 1.Open Chrome browser
        // 2.Go to http://practice.cybertekschool.com/dropdown
        //above is already done!!!
        // 3.Select “December 1st, 1922” and verify it is selected.
        Select yearDropDown= new Select(driver.findElement(By.xpath("//select[@id='year']")));

        // --Select year using: visible text
        yearDropDown.selectByVisibleText("1922");
        String actualYear=yearDropDown.getFirstSelectedOption().getText();
        String expectedYear="1922";
        Assert.assertEquals(actualYear,expectedYear);
        // --Select month using : value attribute
        Select monthDropDown= new Select(driver.findElement(By.xpath("//select[@id='month']")));
        monthDropDown.selectByValue("11");
        String actualMonth= monthDropDown.getFirstSelectedOption().getText();
        String expectedMonth="December";
        Assert.assertEquals(actualMonth,expectedMonth);
        // --Select day using: index number
        Select dayDropDown= new Select(driver.findElement(By.xpath("//select[@id='day']")));
        dayDropDown.selectByIndex(0);
        String actualDay= dayDropDown.getFirstSelectedOption().getText();
        String expectedDay="1";
        Assert.assertEquals(expectedDay,actualDay);

    }

    @Test
    public void tc4_selectMultipleOption(){
        //TC #4: Selecting value from multiple select dropdown
        // 1.Open Chrome browser
        // 2.Go to http://practice.cybertekschool.com/dropdown
        // 3.Select all the options from multiple select dropdown.
       WebElement languageDropDowns= driver.findElement(By.xpath("//select[@name='Languages']"));
       languageDropDowns.click();
       Select selectAllLanguages= new Select(languageDropDowns);
       List<WebElement> languages= selectAllLanguages.getOptions();
        // 4.Print out all selected values.
       for (WebElement each: languages){
           System.out.println(each.getText());
       }
       selectAllLanguages.deselectAll();







        // 5.Deselect all values.
    }

    /*@AfterClass
    public void teardownClass(){
        driver.close();
    }

     */


}
