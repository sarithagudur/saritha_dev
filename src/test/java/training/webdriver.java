package training;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class webdriver {
    public static WebDriver driver;
    public static String url;

    public void openBrowser() throws IOException {
        String browser = System.getProperty("browser");
        String env = System.getProperty("env");


        if (browser.equals("chrome")) {


            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            FirefoxDriverManager.getInstance().setup();
            driver = new FirefoxDriver();

        } else {
            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
        }
        String srcFolder = "src/test/java/training/properties/";
        String envFile = null;

        if (env.equals("live")) {
            envFile = srcFolder + "live.properties";

        } else if (env.equals("qa")) {
            envFile = srcFolder + "qa.properties";
        }
        FileInputStream fis = new FileInputStream(envFile);
        Properties pro = new Properties();
        pro.load(fis);
         url = pro.getProperty("url");


    }

    public void closeBrowser() {
        driver.quit();

    }
}
