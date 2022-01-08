package pages;

import bdd.cucumber.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Base {

    @FindBy(xpath="//input[@placeholder='E-mail address']")
    WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]")
    WebElement loginBtn;

    public LoginPage(WebDriver driver) {
    }


    //methods


    public void login(String userName,String Password){

username.sendKeys(userName);
password.sendKeys(Password);
loginBtn.click();
}
        }