package seleniumFramework.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.List;
import java.util.Set;

public class SharedDriver extends EventFiringWebDriver {
    private static EventFiringWebDriver SHARED_DRIVER = null;

    public SharedDriver() {
	super(getSharedDriver());
    }

    public SharedDriver(Browsers browser) {
	super(setSharedDriver(browser));
    }

    private static WebDriver setSharedDriver(Browsers browser) {
	if (SHARED_DRIVER == null) {
	    createBrowser(browser);
	}
	return SHARED_DRIVER;
    }

    private static EventFiringWebDriver getSharedDriver() {
	if (SHARED_DRIVER == null) {
	    throw new IllegalStateException("SHARED_DRIVER has not been initialised");
	}
	return SHARED_DRIVER;
    }

    private static void createBrowser(Browsers browser) {
	WebDriver driver;
	switch (browser) {
	case FIREFOX:
	    driver = new FirefoxDriver();
	    break;
	case CHROME:
	    driver = new ChromeDriver();
	    break;
	default:
	    driver = new FirefoxDriver();
	}

	SHARED_DRIVER = new EventFiringWebDriver(driver);
	SHARED_DRIVER.register(new EventListener());
    }

    private static final Thread CLOSE_THREAD = new Thread() {
	@Override
	public void run() {
	    SHARED_DRIVER.close();
	}
    };

    static {
	Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
    }

    @Override
    public void close() {
	if (Thread.currentThread() != CLOSE_THREAD) {
	    throw new UnsupportedOperationException(".close() is unsupported - driver will close when JVM ends");
	}
	super.close();
    }

    @Override
    public void get(String url) {
	super.get(url);
    }

    @Override
    public String getCurrentUrl() {
	return super.getCurrentUrl();
    }

    @Override
    public String getTitle() {
	return super.getTitle();
    }

    @Override
    public List<WebElement> findElements(By by) {
	return super.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
	return super.findElement(by);
    }

    @Override
    public String getPageSource() {
	return super.getPageSource();
    }

    @Override
    public void quit() {
	super.quit();
    }

    @Override
    public Set<String> getWindowHandles() {
	return super.getWindowHandles();
    }

    @Override
    public String getWindowHandle() {
	return super.getWindowHandle();
    }

    @Override
    public TargetLocator switchTo() {
	return super.switchTo();
    }

    @Override
    public Navigation navigate() {
	return super.navigate();
    }

    @Override
    public Options manage() {
	return super.manage();
    }

}