package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad2Page {
    public DynamicLoad2Page (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//button[.='Start']")
    public WebElement startButton;

    @FindBy(id="loading")
    public WebElement loadingBar;

    @FindBy (id="username")
    public WebElement usernameButton;

    @FindBy(id="pwd")
    public WebElement passwordButton;

    @FindBy (xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy (id=" flash")
    public WebElement errorMessage;


}
