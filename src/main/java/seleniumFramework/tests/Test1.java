package seleniumFramework.tests;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@CucumberOptions(tags = "@Test1", snippets = SnippetType.UNDERSCORE, dryRun=false)
public class Test1 extends BaseTest{

}
