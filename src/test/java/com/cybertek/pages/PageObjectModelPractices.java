package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageObjectModelPractices {
    @Test
    public void negative_login_to_library_test(){

        Driver.getDriver().get("https://library2.cybertekschool.com/login.html");
        LibraryLoginPage loginPage= new LibraryLoginPage();
        //enter incorrect password
        loginPage.inputEmail.sendKeys("wrong@gmail.com");
        // enter incorrect password
      loginPage.inputPassword.sendKeys("wrong password");
      //click to sign in button
        loginPage.signInButton.click();
        //verify error message is displayed
        Assert.assertTrue(loginPage.incorrectEmailOrPassword.isDisplayed());

    }
}
