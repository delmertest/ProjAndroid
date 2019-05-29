package screens;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CarouselScreen extends MainScreen {
	
	private By numberElement = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']//android.widget.TextView");

	public CarouselScreen(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}
	
	public boolean isNumberDisplayed(String value) {
		return getLocatorText(numberElement).equals(value);
	}

}
