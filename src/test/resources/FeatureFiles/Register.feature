Feature: Registration functionality scenarios

@Register @One
Scenario: Verify weather the user is able to register into the application by providing all the details

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
  					
 	 
