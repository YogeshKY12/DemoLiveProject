package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage {

	
  @FindBy(linkText = "Samsung SyncMaster 941BW")	
  public static WebElement searchLink; 
  
  @FindBy(xpath = "//*[@id=\"content\"]/p[2]")
  public static WebElement notFoundMessage;

}
