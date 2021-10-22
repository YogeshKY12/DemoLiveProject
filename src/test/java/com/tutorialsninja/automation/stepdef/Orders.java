package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;
import com.tutorialsninja.automation.pages.CheckoutPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.OrderSuccessPage;
import com.tutorialsninja.automation.pages.SearchResultsPage;
import com.tutorialsninja.automation.pages.ShoppingCart;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Orders {

	HeaderSection headerSection = new HeaderSection();
	LoginPage loginPage = new LoginPage();
	SearchResultsPage searchResultsPage = new SearchResultsPage();
	ShoppingCart shoppingCart = new ShoppingCart();
	CheckoutPage checkoutPage = new CheckoutPage();
	OrderSuccessPage orderSuccessPage = new OrderSuccessPage();

	@Given("^I login to the application$")
	public void i_login_to_the_application() {

		Browser.openApplicationUrl();
		HeaderSection.naviagteToLoginPage();
		LoginPage.doLogin();

	}

	@When("^I add a product to bad and checkout$")
	public void i_add_a_product_to_bad_and_checkout() {

		HeaderSection.searchProduct();
		SearchResultsPage.addFirstProductToCart();
		HeaderSection.navigateToShoppingCartPage();
		ShoppingCart.clickOnCheckoutButton();

	}

	@And("^I place an order$")
	public void i_place_an_order() {

		CheckoutPage.placeAnOrder();

	}

	@Then("^I should see that the order is successfully placed$")
	public void i_should_see_that_the_order_is_successfully_placed() {
		
		Waits.waitUntilElementLocated(10, OrderSuccessPage.successBreadCrumb);
		Assert.assertTrue(Elements.isDisplayed(OrderSuccessPage.successBreadCrumb));

	}

}
