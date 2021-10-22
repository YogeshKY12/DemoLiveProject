package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ForgotPasswordPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	HeaderSection headerSection = new HeaderSection();
	LoginPage loginpage = new LoginPage();
	MyAccountPage myAccountPage = new MyAccountPage();
    ForgotPasswordPage forgotPassword = new ForgotPasswordPage();	

	@Given("^I navigate to account login page$")
	public void i_navigate_to_account_login_page() {

		Elements.click(HeaderSection.myAccountlink);
		Elements.click(HeaderSection.login);
	}

	@When("^I logiin to the application using username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_logiin_to_the_application_using_username_and_password(String email, String password) {

		LoginPage.doLogin(email, password);

	}

	@Then("^I should see that user is able to login successfully$")
	public void i_should_see_that_user_is_able_to_login_successfully() {

		Assert.assertTrue(Elements.isDisplayed(MyAccountPage.myAffiliateAccount));

	}

	@Then("^I should see that error message that credentials are invald$")
	public void i_should_see_that_error_message_that_credentials_are_invald() {

		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.mainWarning,
				"Warning: No match for E-Mail Address and/or Password."));
	}
	
	@When("^I reset the forgoten password for email \"([^\"]*)\"$")
	public void i_reset_the_forgoten_password_for_email(String email)  {
	   
		Elements.click(LoginPage.forgottenPasswordButton);
		Elements.TypeText(ForgotPasswordPage.emailAddressfield, email);
		Elements.click(ForgotPasswordPage.continueButton);
	}
	


	@Then("^I should see a message informing an email sent to reset the password$")
	public void i_should_see_a_message_informing_an_email_sent_to_reset_the_password(){
		
		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.mainResetMeassage, " An email with a confirmation link has been sent your email address."));
	   
	}

}
