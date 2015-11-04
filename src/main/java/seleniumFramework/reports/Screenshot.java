package seleniumFramework.reports;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import seleniumFramework.browser.SharedDriver;

public class Screenshot {

    public void embedScreenshot(Scenario scenario) {
	try {
	    byte[] screenshot = new SharedDriver().getScreenshotAs(OutputType.BYTES);
	    scenario.embed(screenshot, "image/jpeg");
	} catch (WebDriverException somePlatformsDontSupportScreenshots) {
	    System.err.println(somePlatformsDontSupportScreenshots.getMessage());
	}
    }

}
