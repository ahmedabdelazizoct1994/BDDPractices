package pages;

import bdd.cucumber.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Base {

    public HomePage(WebDriver driver) {

    }
    @FindBy(xpath="//input[@placeholder='Search']")
     public WebElement searchField;


}
