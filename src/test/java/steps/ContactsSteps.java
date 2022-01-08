package steps;

import bdd.cucumber.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.ContactsPage;

public class ContactsSteps extends Base {
    ContactsPage contactsObject=new ContactsPage(driver);

    @When("Clicks on contacts")
    public void clicks_on_contacts() {

contactsObject.clickOnContacts();


    }
    @Then("Email text filed should be visible")
    public void email_text_filed_should_be_visible() {

        Assert.assertTrue(contactsObject.emailField.isDisplayed(),
                "the email text input is found");
    }

}
