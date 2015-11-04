package seleniumFramework.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1 extends BaseSteps {

    @Given("^I go to the selenium homepage$")
    public void i_go_to_the_selenium_homepage() throws Throwable {
	navigate().to("https://github.com/");
    }

    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String searchTerm) throws Throwable {
	// log.info(searchTerm);
    }

    @Then("^I see a custom google search result page for \"([^\"]*)\"$")
    public void i_see_a_custom_google_search_result_page_for(String searchTerm) throws Throwable {
	// log.info(searchTerm);
    }

    @Then("^another steps$")
    public void anotherSteps() throws Throwable {

    }

    @Then("^the text on the page is displayed$")
    public void theTextOnThePageIsDisplayed() throws Throwable {

    }

}
