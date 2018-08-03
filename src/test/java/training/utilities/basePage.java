package training.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import training.webdriver;

public class basePage extends webdriver {
WebDriverWait wait = new WebDriverWait(driver,45);
    public static void openUrl(){

        driver.get(url);

    }
public void waitForElement(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));

}



}
