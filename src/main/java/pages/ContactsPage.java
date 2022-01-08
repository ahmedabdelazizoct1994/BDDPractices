package pages;

import bdd.cucumber.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.backgroundservice.BackgroundService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class ContactsPage  extends Base {


    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/a[1]/i[1]")
    WebElement contacts;

    @FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/button[1]/i[1]" )
    WebElement contactAdd;
    @FindBy(xpath = "//input[@placeholder='Email address']")
   public WebElement emailField;

    public ContactsPage(WebDriver driver) {
    }

    public void clickOnContacts(){
        Actions action=new Actions(driver);
        action.moveToElement(contacts).click(contactAdd).build().perform();
    }

}
