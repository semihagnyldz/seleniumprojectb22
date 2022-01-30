package com.cybertek.tests.day14_synrcronization;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionPractices {
    @Test
    public void drag_drop_practices(){
        //go to the:
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        //drag and drop the small circle to the bigger one
        //assert: text in big circle changed to :"You did great!"
        TelerikPage telerikPage= new TelerikPage();
        telerikPage.acceptCookies.click();
        Actions actions = new Actions(Driver.getDriver());

       // actions.dragAndDrop(telerikPage.smallCircle, telerikPage.bigCircle).perform();
        actions.moveToElement(telerikPage.smallCircle).clickAndHold().moveToElement(telerikPage.bigCircle).release().perform();

        String expected= "You did great!";
        String actual= telerikPage.bigCircle.getText();
        Assert.assertEquals(actual,expected);

        //2nd way:

    }
}
