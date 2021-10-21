Feature: Registration functionality scenarios

@Register @One
Scenario: Verify whether the user is able to register into the application by providing all the details

	Given  I launch the application 
	And 	 I navigate to account registration page
	When 	 I provide all the below details 
  				|FirstName |John 					|
  				|LastName  |Robert				|
  				|Email		 |John@gmail.com|
  				|Telephone |9876532727  	|
  				|Password	 |John					|
  And 	I select the privacy policy
  And   I click on continue button
  Then  I should see that the user account has been successfully created 
  
@Register @Two 
Scenario:  Verify whetherthe user is not allowed to register when manadatory fileds are not selected

  Given  I launch the application 
	And 	 I navigate to account registration page 
	When   I click on continue button
	Then   I should see that the user account is not created
	And    I should see the error messages informing the user to fill the mandatory fields
	
	@Register @Three
Scenario: Verify whether the user is able to register into the application by opting fot newsletter
 
		Given  I launch the application 
  	And 	 I navigate to account registration page
		When 	 I provide all the below details 
  				|FirstName |John 					|
  				|LastName  |Robert				|
  				|Email		 |John@gmail.com|
  				|Telephone |9876532727  	|
  				|Password	 |John					|
  	And 	I select the privacy policy
  	And   I subscribe to newsletter
  	And   I click on continue button
  	Then  I should see that the user account has been successfully created 
  	
  	@Register @Four
Scenario: Verify whether the user is not able to register into the application when duplicate details are given
 
		Given  I launch the application 
  	And 	 I navigate to account registration page
		When 	 I provide all the below duplicate details 
  				|FirstName |John 					|
  				|LastName  |Robert				|
  				|Email		 |John@gmail.com|
  				|Telephone |9876532727  	|
  				|Password	 |John					|
  	And 	I select the privacy policy
  	And   I click on continue button
  	Then  I should see that the user should be restricted from creating account 
  
	
  					
 	 
