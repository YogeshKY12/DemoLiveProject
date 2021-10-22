Feature: Scenarios related to placing orders


  @Orders @One
  Scenario: Verify whether the user is able to place the order 
  
   Given I login to the application
   When I add a product to bad and checkout
   And I place an order
   Then I should see that the order is successfully placed
   
   
  
