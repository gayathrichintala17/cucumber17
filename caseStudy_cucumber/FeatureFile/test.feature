Feature: Register
Scenario: Register on TestMe App
	Given user open TestMeApp
	When user click signup
	And enter user name as "gayathri"
	And enter first name as "gayathri"
	And enter last name as "gayathri" 
	And enter password as "gayathri123"
	And enter confirm password as "gayathri123"
	And enter gender as "female"
	And enter email as "gayathri@gmail.com"
	And enter mobile number as "9876543210"
	And enter dob as "27/01/1997"
	And enter address as "karadi by pass"
	And enter answer as "rhino"
	Then user click Register
	@Login
	Scenario: Search using datatable
	Given user open TestMeApp
	When user click signin
	And user enter credentials as
	|lalitha |
	|Password123 |
	
	@search
	Scenario: Search using datatable
	Given user open TestMeApp
	When user click signin
	And user enter credentials as
	|lalitha|
	|Password123|
	
	And user search the product
	|Headphone |
	And user click on find button