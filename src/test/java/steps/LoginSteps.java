package steps;

import bdd.cucumber.Base;
import com.google.common.base.Verify;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class LoginSteps  extends Base {

    LoginPage loginObject;
    HomePage homeObject;

    @Given("User open the website and go to login page")
    public void user_open_the_website_and_go_to_login_page() {
launchBrowser();


    }

    @When("User fill email {string}  and {string} and click login")
    public void userFillEmailAndAndClickLogin(String arg0, String arg1) {

        loginObject = new LoginPage(driver);
        loginObject.login(arg0, arg1);
    }
    @Then("User should navigate to home page")
    public void user_should_navigate_to_home_page() {
homeObject=new HomePage(driver);

       Verify.verify(homeObject.searchField.isDisplayed(),
            "The search box is displayed");

    }



}

