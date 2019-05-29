package screens;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginScreen extends MainScreen{
	
	protected By username = By.xpath("//android.widget.EditText[@content-desc=\"username\"]");
	protected By password = By.xpath("//android.widget.EditText[@content-desc=\"password\"]");
	protected By loginButton = By.xpath("//android.view.ViewGroup[@content-desc=\"login\"]/android.widget.Button/android.widget.TextView");

	
	public LoginScreen(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}
	
	public void setUsername(String value) {
		waitClearAndSet(username, value);
	}
	
	public void setPassword(String value) {
		waitClearAndSet(password, value);
	}
	
	public void clickLogin() {
		waitAndClick(loginButton);
	}

}
