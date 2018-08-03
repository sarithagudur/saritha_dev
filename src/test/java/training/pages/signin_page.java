package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import training.utilities.basePage;
import training.webdriver;

import static junit.framework.TestCase.assertEquals;

public class signin_page extends webdriver {
    @FindBy(css = ".sign-in")
    private WebElement signin_button;

    @FindBy(id = "signin_sd-username")
    private WebElement username_text;

@FindBy(id = "YourBookingsLinkBreadcrumb")
private WebElement actualMessage_element;


@FindBy(id = "signin_sd-password")
private WebElement pwd_text;

    public void click_signin() {


        signin_button.click();


    }


    public void email_text(String email){
        username_text.sendKeys(email);


    }


    public void pwd_text(String pwd){
        pwd_text.sendKeys(pwd);

    }
    public void assertMsg(String expectedmessage){
        basePage bPage = new basePage();
        bPage.waitForElement(actualMessage_element);

        System.out.println(expectedmessage);
        String actualMessage;
        actualMessage = actualMessage_element.getText();
        assertEquals(expectedmessage,actualMessage);


    }

}