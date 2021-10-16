package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {
	
    
	
	@Given("^I launch the application$")
	public void i_launch_the_application()  {
	    
		Base.driver.get(Base.reader.getUrl());
		
	}

	@And("^I navigate to account registration page$")
	public void i_navigate_to_account_registration_page()  {
	    
		
	}

	@When("^I provide all the below details$")
	public void i_provide_all_the_below_details(DataTable datatable)  {
	    
		
	}

	@And("^I select the privacy policy$")
	public void i_select_the_privacy_policy()  {
	    
		
	}

	@And("^I click on continue button$")
	public void i_click_on_continue_button()  {
	    
		
	}

	@Then("^I should see that the user account has been successfully created$")
	public void i_should_see_that_the_user_account_has_been_successfully_created()  {
	    
		
	}
	
	

}
