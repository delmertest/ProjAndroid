package steps;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class MainSteps {

	protected static AndroidDriver<AndroidElement> driver;
	protected static AppiumDriverLocalService service;
	
	public static AndroidDriver<AndroidElement> setDriver() throws IOException {
		
		InputStream input = new FileInputStream("src/test/java/resources/params.properties");
		Properties prop = new Properties();
		prop.load(input);
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, prop.getProperty("deviceName"));
		desiredCapabilities.setCapability("platformName", prop.getProperty("platformName"));
		desiredCapabilities.setCapability("appPackage", prop.getProperty("appPackage"));
		desiredCapabilities.setCapability("appActivity", prop.getProperty("appActivity"));

		return new AndroidDriver<AndroidElement>(new URL(prop.getProperty("url")), desiredCapabilities);
		
	}
}
