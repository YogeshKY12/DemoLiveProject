package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.SearchResultsPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Search {
	
	HeaderSection headerSection = new HeaderSection();
	SearchResultsPage searchResultsPage = new SearchResultsPage();
	
	
	@When("^I search for 	a product \"([^\"]*)\"$")
	public void i_search_for_a_product(String product){
	    
		Elements.TypeText(HeaderSection.searchFieldBox, product);
		Elements.click(HeaderSection.searchbutton);
		
	}

	@Then("^I should see the product in the search results$")
	public void i_should_see_the_product_in_the_search_results(){
		
		Assert.assertTrue(Elements.isDisplayed(SearchResultsPage.searchLink));
	    
	}
	
    @Then("^I should see a message informing 	\"([^\"]*)\"$")
public void i_should_see_a_message_informing(String product) {
    	
    	Assert.assertTrue(Elements.isDisplayed(SearchResultsPage.notFoundMessage));
 
}

}
