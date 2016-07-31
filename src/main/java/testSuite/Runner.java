package testSuite;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "html:target/Cucumber-report/reports.html",
				"json:target/Cucumber-report/cucumber.json",
		"junit:target/Cucumber-report/cucumber-report.xml"},
		features = "classpath:features",
		glue="stepDefinitions",
		monochrome=true
		)
public class Runner {

}
