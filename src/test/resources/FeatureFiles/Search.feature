Feature:Search functinality scenario

 
 @Search @One	
 Scenario: Verify whether the user is able to search for the products
   
     Given  I launch the application
     When  	I search for 	a product "Samsung SyncMaster 941BW"
     Then 	I should see the product in the search results
     
     
  @Search @Two	
 Scenario: Verify whether the user is informed when the product being is not avaialble
   
     Given  I launch the application
     When  	I search for 	a product "Apple iphone"
     Then 	I should see a message informing 	"There is no product that matches the search criteria."   
     
     
     
     

     

 