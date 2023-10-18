package StepDefs;


import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.SignInPage;

public class SignIn extends Hooks{
	WebDriver driver = Hooks.driver;
	SignInPage lp;

	@When("user entered email address and password")
	public void user_entered_email_address_and_password() throws InterruptedException {
		lp = new SignInPage(driver);
		lp.getLoginbtn1();
		lp.getUsername();
		lp.getPwd();
		Thread.sleep(3000);
	}

	@When("click on signup button")
	public void click_on_signup_button() {
		lp = new SignInPage(driver);
		lp.getLoginBtn();
	}

	@Then("validate logout button is displayed")
	public void validate_logout_button_is_displayed() {
		lp = new SignInPage(driver);
		lp.getLogoutBtnVal();

	}

}