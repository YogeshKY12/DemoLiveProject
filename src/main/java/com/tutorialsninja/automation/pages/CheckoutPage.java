package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class CheckoutPage {
	
	
	public CheckoutPage() {
		
		PageFactory.initElements(Base.driver, this);
	}
	     
	
	@FindBy(css = "input[id='button-payment-address']")
    public static  WebElement	billingDetailsContinueButton;
	
	
	@FindBy(css= "input[id='button-shipping-address']")
	public static WebElement deliveryDetailsContinueButton;	
	
	@FindBy(css = "input[id='button-shipping-method']")
	public static WebElement deliveryMethodContinueButton;
	
	@FindBy(css = "input[name='agree'][value='1']")
	public static WebElement termsAndConditions;
	
	
	@FindBy(xpath="//input[@id='button-payment-method']")
	public static WebElement paymentMethodContinue;
	
	
	@FindBy(xpath= "//input[@id='button-confirm']")  
	public static WebElement confirmOrderButton;
	
	
	public static void placeAnOrder() {
		
		Elements.click(billingDetailsContinueButton);
		Elements.click(deliveryDetailsContinueButton);
		Elements.click(deliveryMethodContinueButton);
		Elements.click(termsAndConditions);
		Elements.click(paymentMethodContinue);
		Elements.click(confirmOrderButton);
		
		
	}
	
	
	
	
	
	
	
	

}
