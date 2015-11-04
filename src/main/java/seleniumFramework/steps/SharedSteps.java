package seleniumFramework.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import seleniumFramework.browser.Browsers;
import seleniumFramework.browser.SharedDriver;
import seleniumFramework.reports.Screenshot;

public class SharedSteps extends SharedDriver {
    public SharedSteps() {
	super(Browsers.FIREFOX);
    }

    @Before
    public void before() {
	manage().deleteAllCookies();
    }

    @After
    public void after(Scenario scenario) {
	new Screenshot().embedScreenshot(scenario);
    }

}
