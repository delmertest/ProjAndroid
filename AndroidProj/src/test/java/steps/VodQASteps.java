package steps;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screens.CarouselScreen;
import screens.LoginScreen;
import screens.SamplesListScreen;

public class VodQASteps extends MainSteps{
	
	private LoginScreen loginScreen;
	private SamplesListScreen samplesListScreen;
	private CarouselScreen carouselScreen;
	
	@Given("I set up appium server")
	public void i_set_up_appium_server() throws IOException {
		driver = setDriver();
	}
	
	@When("I login with user {string} and password {string}")
	public void i_login_with_user_and_password(String string, String string2) {
		loginScreen = new LoginScreen(driver);
		loginScreen.setUsername(string);
		loginScreen.setPassword(string2);
		loginScreen.clickLogin();
	}

	@When("I tap on Carousel")
	public void i_tap_on_Carousel() {
		samplesListScreen = new SamplesListScreen(driver);
		samplesListScreen.clickCarousel();
	}

	@Then("I verify that the first number displayed is {string}")
	public void i_verify_that_the_first_number_displayed_is(String string) {
		carouselScreen = new CarouselScreen(driver);
		assertTrue("El elemento mostrado no es "+string, carouselScreen.isNumberDisplayed(string));
	}

}
