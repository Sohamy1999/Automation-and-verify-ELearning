package Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/Sitefeature"
		,glue= {"Stepdefination","Hookstart"},
		dryRun= false,
		monochrome=true,
		
		//tags= {"@Test1","@Test2"},
		plugin= {"pretty","html:target/cucumber-pretty","junit:target/report.xml","json:target/jsonreport.json"}
		)

public class testrunner {

}
