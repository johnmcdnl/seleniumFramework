package seleniumFramework.steps;

import org.junit.Assert;

import cucumber.api.java.en.Then;

public class Step2 extends BaseSteps {

    @Then("^the page title is \"([^\"]*)\"$")
    public void thePageTitleIs(String expectedTitle) throws Throwable {
	Assert.assertEquals(expectedTitle, getTitle());
    }
}
