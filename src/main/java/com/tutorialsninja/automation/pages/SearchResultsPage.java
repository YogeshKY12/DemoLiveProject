package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tutorialsninja.automation.framework.Elements;

public class SearchResultsPage {

	
  @FindBy(linkText = "Samsung SyncMaster 941BW")	
  public static WebElement searchLink; 
  
  @FindBy(xpath = "//*[@id=\"content\"]/p[2]")
  public static WebElement notFoundMessage;
  
  @FindBy(xpath="//span[text()='Add to Cart'][1]")
  public static  WebElement addToCart;
  
  
  public static void addFirstProductToCart() {
	  
	  Elements.click(addToCart);
  }
  

}
