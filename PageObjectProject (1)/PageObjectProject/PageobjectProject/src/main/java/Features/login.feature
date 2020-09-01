Feature: Free CRM Login Feature

Scenario Outline: Login with correct user and password
    Given user is already on Login Page
	Then user enters "<username>" and "<password>"
	Then user clicks on login button
	Then user is on home page

Examples:
	| username | password |
	| Pallavi | test@123 |