package screens;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;

public class MainScreen {
	
	protected AndroidDriver<AndroidElement> driver;
	protected WebDriverWait wait;
	
	public MainScreen(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
	}
	
	public boolean isElementDisplayed(By by) {
		boolean isDisplayed = true;
		try {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
		} catch (Exception e) {
			isDisplayed = false;
		}
		return isDisplayed;
	}
	
	public void waitAndClick(By by) {
		wait.until(ExpectedConditions.elementToBeClickable(by));
		driver.findElement(by).click();
	}
	
	public void waitClearAndSet(By by, String value) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		driver.findElement(by).clear(); 
		driver.findElement(by).sendKeys(value);
		driver.hideKeyboard();
	}
	
	public String getLocatorText(By by) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		return driver.findElement(by).getText().trim();
	}
	
	public void scrollDownToElement(By by) {
		wait.withTimeout(Duration.ofMillis(30000));
		Dimension size = driver.manage().window().getSize();
	    int startX = (int) (size.width/2);
	    int startY = (int) (size.height/2);
		
		TouchAction action = new TouchAction(driver);
		while (!isElementDisplayed(by)) {
			action.press(PointOption.point(startX,startY)).moveTo(PointOption.point(startX,1)).perform().release();
		}
   }
	
	public void scrollDownToElement(String value) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+value+"\").instance(0))").click();
   }

}
