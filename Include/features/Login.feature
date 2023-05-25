Feature: Login feature

Scenario Outline: Test login with valid credentials

	Given User navigate to login screen
	When User enter <username> and <password>
	And Tap on login button
	And Eneterd the PIN
	Then User Successfuly login

		Examples:
			|   		 username 					 |  password		| 
			| noushad.pathan@eigital.com |	Noushad@123 |