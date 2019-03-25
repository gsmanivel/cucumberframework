package com.manman.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*@CucumberOptions(
		dryRun=false,
		strict=false,
		monochrome=false,
		features= {"C:/Users/manivel/eclipse-workspace/cucumberframework/cucumberwork/src/test/resources/com.manman.feature/login.feature"},
		glue = {"C:/Users/manivel/eclipse-workspace/cucumberframework/cucumberwork/src/test/java/com/manman/testcases/LoginTest.java"},
		plugin= {
				"html:target/site/cucumber-html",
				"json:target/cucumber1.json"},
				tags = {"@DeletePortFolio"}			
		)

public class TestRunner {

}
*/


@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"cucumberframework/cucumberwork/src/test/resources/com/manman/feature/"},
		glue = {"cucumberframework/cucumberwork/src/test/java/com/manman/testcases/"}
		)
		public class TestRunnerr {}