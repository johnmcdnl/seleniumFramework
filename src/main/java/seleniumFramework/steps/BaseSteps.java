package seleniumFramework.steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import seleniumFramework.browser.Browsers;
import seleniumFramework.browser.SharedDriver;

public class BaseSteps extends SharedDriver {
    public Logger log = LoggerFactory.getLogger(this.getClass());

    public BaseSteps() {
	super(Browsers.FIREFOX);
    }

}
