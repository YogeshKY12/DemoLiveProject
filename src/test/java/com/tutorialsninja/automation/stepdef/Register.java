package com.tutorialsninja.automation.stepdef;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.RegisterPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Register {

	HeaderSection headerSection = new HeaderSection();
	RegisterPage registerpage = new RegisterPage();
	AccountSuccessPage accountSuccessPage=new AccountSuccessPage();

	@Given("^I launch the application$")
	public void i_launch_the_application() {

		Base.driver.get(Base.reader.getUrl());

	}

	@And("^I navigate to account registration page$")
	public void i_navigate_to_account_registration_page() {

		Elements.click(HeaderSection.myAccountlink);
		Elements.click(HeaderSection.register);

	}

	@When("^I provide all the below details$")
	public void i_provide_all_the_below_details(DataTable datatable) {

		RegisterPage.enterAllDetails(datatable, "unique");

	}

	@And("^I select the privacy policy$")
	public void i_select_the_privacy_policy() {
		
		Elements.click(RegisterPage.privacyPolicy);

	}

	@And("^I click on continue button$")
	public void i_click_on_continue_button() {
		
		Elements.click(RegisterPage.continueButton);

	}

	@Then("^I should see that the user account has been successfully created$")
	public void i_should_see_that_the_user_account_has_been_successfully_created() {
		
		Assert.assertTrue(Elements.isDisplayed(AccountSuccessPage.success));
		

	}
	
	@Then("^I should see that the user account is not created$")
	public void i_should_see_that_the_user_account_is_not_created() {
		
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.registerBreadCrumb));
	    
	}

	@And("^I should see the error messages informing the user to fill the mandatory fields$")
	public void i_should_see_the_error_messages_informing_the_user_to_fill_the_mandatory_fields() {
		
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.firstNameError));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.lastNameError));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.email));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.passwordError));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.telephneError));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.privacyPolicyError));
	    
	}
	
	@And("^I subscribe to newsletter$")
	public void i_subscribe_to_newsletter() {
	    
	    Elements.click(RegisterPage.subscribeRadiobutton);
	}
	
	@When("^I provide all the below duplicate details$")
	public void i_provide_all_the_below_duplicate_details(DataTable datatable) {
		
		RegisterPage.enterAllDetails(datatable, "duplicate");
	}

	@Then("^I should see that the user should be restricted from creating account$")
	public void i_should_see_that_the_user_should_be_restricted_from_creating_account() {
		
		Assert.assertTrue(Elements.VerifyTextEquals(RegisterPage.privacyPolicyError, "Warning: E-mail Address is already registered"));
	   
	}
	

}
