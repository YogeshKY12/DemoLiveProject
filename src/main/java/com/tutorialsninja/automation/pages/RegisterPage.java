package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class RegisterPage {

	public RegisterPage() {

		PageFactory.initElements(Base.driver, this);

	}

	@FindBy(id = "input-firstname")
	public static WebElement firstName;

	@FindBy(id = "input-lastname")
	public static WebElement lastName;

	@FindBy(id = "input-email")
	public static WebElement email;

	@FindBy(id = "input-telephone")
	public static WebElement telephone;

	@FindBy(id = "input-password")
	public static WebElement password;
	
	@FindBy(name= "agree")
	public static WebElement privacyPolicy;
	
	@FindBy(css="input[type='submit'][value='Continue']")
	public static WebElement continueButton;
	
	
	@FindBy(linkText = "Register")
	public static WebElement registerBreadCrumb;
	
	@FindBy(css="input[id='input-firstname']+div")
	public static WebElement firstNameError;
	
	@FindBy(css="input[id='input-lastname']+div") 
	public static WebElement lastNameError;
	
	@FindBy(css= "input[id='input-email']+div")
	public static WebElement  emailError;
	
	@FindBy(css="input[id='input-telephone']+div")
	public static WebElement telephneError;
	
	@FindBy(css= "input[id='input-password']+div")
	public static WebElement passwordError;
	
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement privacyPolicyError;
	
	@FindBy(css="input[name='newsletter'][value='1']")
	public static WebElement subscribeRadiobutton;
	
	
	
	

	public static void enterAllDetails(DataTable datatable, String detailsType ) {

		Map<String, String> map = datatable.asMap(String.class, String.class);

		Elements.TypeText(RegisterPage.firstName, map.get("FirstName"));
		Elements.TypeText(RegisterPage.lastName, map.get("LastName"));
		Elements.TypeText(RegisterPage.email,System.currentTimeMillis()+map.get("Email"));
		Elements.TypeText(RegisterPage.telephone, map.get("Telephone"));
		Elements.TypeText(RegisterPage.password, map.get("Password"));
		
		if(detailsType.equalsIgnoreCase("duplicate"))
			Elements.TypeText(RegisterPage.email,map.get("Email"));
		else
			Elements.TypeText(RegisterPage.email,System.currentTimeMillis()+map.get("Email"));
			
			

	}
	
	

}
