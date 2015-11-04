package seleniumFramework.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class EventListener extends AbstractWebDriverEventListener {

    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {
	System.out.println("beforeNavigateTo: " + driver.getCurrentUrl());
    }

    @Override
    public void afterNavigateTo(String url, WebDriver driver) {
	System.out.println("afterNavigateTo: " + driver.getCurrentUrl());
    }

    @Override
    public void beforeNavigateBack(WebDriver driver) {
	System.out.println("beforeNavigateBack: " + driver.getCurrentUrl());
    }

    @Override
    public void afterNavigateBack(WebDriver driver) {
	System.out.println("afterNavigateBack: " + driver.getCurrentUrl());
    }

    @Override
    public void beforeNavigateForward(WebDriver driver) {
	System.out.println("beforeNavigateForward: " + driver.getCurrentUrl());
    }

    @Override
    public void afterNavigateForward(WebDriver driver) {
	System.out.println("afterNavigateForward: " + driver.getCurrentUrl());
    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
	// TODO Auto-generated method stub
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
	// TODO Auto-generated method stub
    }

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
	// TODO Auto-generated method stub
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
	// TODO Auto-generated method stub
    }

    @Override
    public void beforeChangeValueOf(WebElement element, WebDriver driver) {
	// TODO Auto-generated method stub
    }

    @Override
    public void afterChangeValueOf(WebElement element, WebDriver driver) {
	// TODO Auto-generated method stub
    }

    @Override
    public void beforeScript(String script, WebDriver driver) {
	// TODO Auto-generated method stub
    }

    @Override
    public void afterScript(String script, WebDriver driver) {
	// TODO Auto-generated method stub
    }

    @Override
    public void onException(Throwable throwable, WebDriver driver) {
	// TODO Auto-generated method stub
    }

}
