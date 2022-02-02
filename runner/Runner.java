package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features="src/test/java/week6/day1/features/CreateContactWithHooks.feature", glue="steps", monochrome= true, 
				dryRun = false, snippets=SnippetType.CAMELCASE, tags ="@Functional", publish = true)
public class Runner extends AbstractTestNGCucumberTests{
	
	/*
	 * @DataProvider(indices=1) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 */
}
