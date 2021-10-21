package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class HeaderSection {
	
	
	public HeaderSection(){
		
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	public static WebElement myAccountlink;
	
	@FindBy(linkText = "Register")
	public static WebElement register;
	
	

}
