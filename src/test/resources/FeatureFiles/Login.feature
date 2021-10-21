Feature: Login functionality scenarios

 @Login @One 
 Scenario: Verify whether the user is able to login with credentials

 		Given 	I launch the application 
   	And 	  I navigate to account login page
   	When    I logiin to the application using username "John@gmail.com" and password "John"
   	Then 		I should see that user is able to login successfully 
   	
 @Login @Two
 Scenario: Verify whether the user is not able to login with invalid credentials

 		Given 	I launch the application 
   	And 	  I navigate to account login page
   	When    I logiin to the application using username "John99@gmail.com" and password "John99"
   	Then 		I should see that error message that credentials are invald  	
   	
   	
  @Login @Three
 Scenario: Verify whether the user is not able to login without any credentials

 		Given 	I launch the application 
   	And 	  I navigate to account login page
   	When    I logiin to the application using username "" and password ""
   	Then 		I should see that error message that credentials are invald  
   	
  @Login @Four
 Scenario: Verify whether the user is able to reset password

 		Given 	I launch the application 
   	And 	  I navigate to account login page
   	When    I reset the forgoten password for email "John@gmail.com"
   	Then 		I should see a message informing an email sent to reset the password
   	
   	 	
 


