package screens;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SamplesListScreen extends MainScreen{
	
	protected By carousel = By.xpath("//android.view.ViewGroup[@content-desc=\"carousel\"]/android.view.ViewGroup");

	public SamplesListScreen(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}
	
	public void clickCarousel() {
		scrollDownToElement("Carousel");
		waitAndClick(carousel);
	}

}
