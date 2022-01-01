package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginSteps {

    @Given("User open the website and go to login page")
    public void user_open_the_website_and_go_to_login_page() {

        WebDriverManager.chromedriver().setup();
       WebDriver driver= new ChromeDriver();
    driver.navigate().to("https://classic.freecrm.com");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @When("User fill email and password and click login")
    public void user_fill_email_and_password_and_click_login() {

    }
    @Then("User should navigate to home page")
    public void user_should_navigate_to_home_page() {

    }
}
