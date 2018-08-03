package training.stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import training.pages.signin_page;
import training.utilities.basePage;
import training.webdriver;

import static org.junit.Assert.assertEquals;

public class signin_sd extends basePage {
    webdriver web_driver = new webdriver();
   public signin_page siginPage = PageFactory.initElements(web_driver.driver,signin_page.class);


    @Given("^I enter url as \"([^\"]*)\"$")
    public void iEnterUrlAs(String url) throws Throwable {

        web_driver.driver.get(url);
    }

    @And("^I click on the sign in$")
    public void iClickOnTheSignIn() throws Throwable {
//        driver.findElement(By.className("sign-in")).click();
        siginPage.click_signin();
    }

    @And("^I check the check box of returning customer$")
    public void iCheckTheCheckBoxOfReturningCustomer() throws Throwable {
        web_driver.driver.findElement(By.id("RegisteredUserSignInOption")).click();
    }

    @When("^I click the signin button$")
    public void iClickTheSigninButton() throws Throwable {
        web_driver.driver.findElement(By.id("signin_sd-login")).click();
    }

    @And("^I enter  email id as \"([^\"]*)\"$")
    public void iEnterEmailIdAs(String email) throws Throwable {
//       driver.findElement(By.id("signin_sd-username")).sendKeys(email);

        siginPage.email_text(email);

    }

    @Given("^I enter url$")
    public void iEnterUrl() throws Throwable {
        web_driver.driver.get(web_driver.url);
    }

    @Then("^I should receive the message\"([^\"]*)\"$")
    public void iShouldReceiveTheMessage(String expectedmessage) throws Throwable {
        siginPage.assertMsg(expectedmessage);
    }

}
