package training;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", tags ={"@excel"} ,plugin = {"json:target/cucumber.json"})



public class runcucumber {
}
