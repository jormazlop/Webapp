package cucumberTests;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

	
@RunWith(Cucumber.class)
@CucumberOptions(features= {"resources/features"}, glue="stepDefinitions")
public class TestCucumber {
	


}
