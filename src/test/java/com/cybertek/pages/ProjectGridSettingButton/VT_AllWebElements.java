package com.cybertek.pages.ProjectGridSettingButton;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VT_AllWebElements {
    WebDriver driver= Driver.getDriver();
    public VT_AllWebElements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath= "//input[@type='text']")
    public WebElement username;
    @FindBy (xpath= "//input[@type='password']")
    public WebElement password;
    @FindBy (xpath="//button[@type='submit']")
    public WebElement login;
    @FindBy (xpath = "(//li[@class='dropdown dropdown-level-1'])[1]")
    public WebElement fleetButton;
    @FindBy (xpath= "//*[@id='main-menu']//div//ul/li/a/span[.='Vehicles']")
    public WebElement vehicleMenuButton;
    @FindBy (xpath = "(//div[@class='actions-panel pull-right form-horizontal']//a)[4]")
    //(//div[@class='actions-panel pull-right form-horizontal']//div)[2]
    public WebElement gridSettingsButton;

    //List<WebElement> parentOfGridButtonElement= Driver.getDriver().findElements(By.xpath("(//div[@class='actions-panel pull-right form-horizontal']//a)"));




}
