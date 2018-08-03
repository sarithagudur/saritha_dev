package training.stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import training.pages.excel_page;

public class excel_sd {
    @Given("^I read excel$")
    public void iReadExcel() throws Throwable {
excel_page excel1 = new excel_page();
excel1.excel();



    }



}
