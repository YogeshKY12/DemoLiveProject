package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class HeaderSection {
	
	
	public HeaderSection(){
		
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	public static WebElement myAccountlink;
	
	@FindBy(linkText = "Register")
	public static WebElement register;
	
	
	@FindBy(linkText = "Login" )
	public static WebElement login; 
	
	
	@FindBy(name = "search")
	public static WebElement searchFieldBox;
	
	@FindBy(css="button[class$='btn-lg']")
	public static WebElement searchbutton;
	
	@FindBy(xpath="//span[text()='Shopping Cart']")
	public static WebElement viewShoppingCart;
	
	public static void naviagteToLoginPage()
	{
		Elements.click(myAccountlink);
		Elements.click(login);
	}
	
	public static void searchProduct() {
		Elements.TypeText(searchFieldBox, Base.reader.getProduct());
		Elements.click(searchbutton);
	}
	
	public static void navigateToShoppingCartPage() {
		Elements.click(viewShoppingCart);
	}
	

}
