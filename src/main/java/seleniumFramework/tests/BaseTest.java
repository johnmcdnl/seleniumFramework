package seleniumFramework.tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=false,
		glue="",
		monochrome=false,
		features="src/test/resources",
		snippets=SnippetType.CAMELCASE,
		strict=true,
		plugin = { "pretty", "html:target/cucumber" }
		)
public class BaseTest{
   
}
