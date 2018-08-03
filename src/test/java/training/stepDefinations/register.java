package training.stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import training.pages.signin_page;
import training.utilities.basePage;
import training.webdriver;

import static org.junit.Assert.assertEquals;

public class register extends basePage {
    webdriver web_driver = new webdriver();
    public signin_page siginPage = PageFactory.initElements(web_driver.driver,signin_page.class);




    @And("^I enter email id as \"([^\"]*)\"$")
    public void iEnterEmailIdAs(String email) throws Throwable {
        driver.findElement(By.id("EmailAddress")).sendKeys(email);

    }

    @And("^I enter confirm email id as \"([^\"]*)\"$")
    public void iEnterConfirmEmailIdAs(String confEmail) throws Throwable {
        driver.findElement(By.id("EmailAddressCheck")).sendKeys(confEmail);
    }

    @And("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String pwd) throws Throwable {
      //  driver.findElement(By.id("signin_sd-password")).sendKeys(pwd);


    }

    @And("^I enter Confirm password as \"([^\"]*)\"$")
    public void iEnterConfirmPasswordAs(String confPwd) throws Throwable {
        driver.findElement(By.id("PasswordCheck")).sendKeys(confPwd);


    }

    @And("^I enter title as \"([^\"]*)\"$")
    public void iEnterTitleAs(String title) throws Throwable {
        driver.findElement(By.id("TitleTypeCode")).sendKeys(title);

    }

    @And("^I enter firstName as \"([^\"]*)\"$")
    public void iEnterFirstNameAs(String firstName) throws Throwable {
        driver.findElement(By.id("FirstName")).sendKeys(firstName);
    }

    @And("^I enter surname as \"([^\"]*)\"$")
    public void iEnterSurnameAs(String surName) throws Throwable {
        driver.findElement(By.id("LastName")).sendKeys(surName);
    }

    @And("^I enter Address as \"([^\"]*)\"$")
    public void iEnterAddressAs(String add1) throws Throwable {
        driver.findElement(By.id("Address1")).sendKeys(add1);

    }

    @And("^I enter Address Continued as \"([^\"]*)\"$")
    public void iEnterAddressContinuedAs(String add2) throws Throwable {
        driver.findElement(By.id("Address2")).sendKeys(add2);

    }

    @And("^I enter town/city as \"([^\"]*)\"$")
    public void iEnterTownCityAs(String town) throws Throwable {
        driver.findElement(By.id("City")).sendKeys(town);

    }

    @And("^I enter postcode as\"([^\"]*)\"$")
    public void iEnterPostcodeAs(String postCode) throws Throwable {
        driver.findElement(By.id("PostalCode")).sendKeys(postCode);

    }

    @And("^I enter country as \"([^\"]*)\"$")
    public void iEnterCountryAs(String country) throws Throwable {
        driver.findElement(By.id("Country")).sendKeys(country);

    }

    @And("^I enter mobile as \"([^\"]*)\"$")
    public void iEnterMobileAs(String mobile) throws Throwable {
        driver.findElement(By.id("MobilePhone")).sendKeys(mobile);

    }

    @And("^I select \"([^\"]*)\" from the dropdown menu of departing$")
    public void iSelectFromTheDropdownMenuOfDeparting(String depart) throws Throwable {
        driver.findElement(By.id("PreferredAirport1")).sendKeys(depart);

    }

    @And("^I check the check box to receive updates$")
    public void iCheckTheCheckBoxToReceiveUpdates() throws Throwable {
        driver.findElement(By.id("OptInForEasyJetMailings")).click();
    }

    @When("^I click the register button$")
    public void iClickTheRegisterButton() throws Throwable {
        driver.findElement(By.id("btnRegister")).click();
    }



}
