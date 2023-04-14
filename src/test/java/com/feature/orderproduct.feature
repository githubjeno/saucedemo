Feature: order all products in swaglabs 

Scenario: Login with valid Username and password 
	Given user enters the url 
	When user enters valid username and password
	And Click on login button 
	
	
Scenario: user adds all the product to the cart 
	When user adds all the products to the cart 
	And clicks on his cart 
	And clicks on Checkout button 
	
Scenario: user makes checkout by entering all the details 
	When user enter his first name "greentech" second name "anna nagar" zipcode "600001" 
	And clicks on continue button 
	Then display payment information and shipping information and toatal price 
	And click on Finish button 
	And validate Thank you for your order