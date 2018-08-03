package training;


import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;


public class Hooks {

    @Before
    public void browser_open() throws IOException {

        webdriver web_driver = new webdriver();
        web_driver.openBrowser();


    }

    @After
    public void browser_close() {
        webdriver web_driver = new webdriver();
        web_driver.closeBrowser();
    }


}
