package seleniumFramework.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.List;
import java.util.Set;

public class SharedDriver extends EventFiringWebDriver implements WebDriver {

    public SharedDriver() {
        super(SHARED_DRIVER);
    }

    public SharedDriver(Browsers browser) {
        super(getRequiredBrowser(browser));
    }

    private static WebDriver getRequiredBrowser(Browsers browser) {
        if (SHARED_DRIVER == null) {
            switch (browser) {
                case FIREFOX:
                    SHARED_DRIVER = new FirefoxDriver();
                    break;
                case CHROME:
                    SHARED_DRIVER = new ChromeDriver();
                    break;
                default:
                    SHARED_DRIVER = new FirefoxDriver();
            }
        }
        return SHARED_DRIVER;
    }

    public static WebDriver SHARED_DRIVER = null;

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
        SHARED_DRIVER.get(url);
    }

    @Override
    public String getCurrentUrl() {
        return SHARED_DRIVER.getCurrentUrl();
    }

    @Override
    public String getTitle() {
        return SHARED_DRIVER.getTitle();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return SHARED_DRIVER.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        return SHARED_DRIVER.findElement(by);
    }

    @Override
    public String getPageSource() {
        return SHARED_DRIVER.getPageSource();
    }

    @Override
    public void quit() {
        SHARED_DRIVER.quit();
    }

    @Override
    public Set<String> getWindowHandles() {
        return SHARED_DRIVER.getWindowHandles();
    }

    @Override
    public String getWindowHandle() {
        return SHARED_DRIVER.getWindowHandle();
    }

    @Override
    public TargetLocator switchTo() {
        return SHARED_DRIVER.switchTo();
    }

    @Override
    public Navigation navigate() {
        return SHARED_DRIVER.navigate();
    }

    @Override
    public Options manage() {
        return SHARED_DRIVER.manage();
    }

}