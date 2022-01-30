package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {
    //create constructor:
    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
        //this is pointing to the object of the class that is located before the comma.
    }
    @FindBy (id= "inputEmail")
    public WebElement inputEmail;

    @FindBy (id= "inputPassword")
    public WebElement inputPassword;

    @FindBy (xpath= "//button[text()='Sign in']")
    public WebElement signInButton;

    @FindBy (xpath= "//div[@class='alert alert-danger']")
    public WebElement incorrectEmailOrPassword;

    @FindBy (id="inputEmail-error")
    public WebElement inValidEmailFormat;



}

