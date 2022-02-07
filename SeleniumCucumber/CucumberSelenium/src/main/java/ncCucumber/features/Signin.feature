Feature: Sign in feature


Scenario Outline: SIGNIN : ##0001: Sign In / Sign Out
Then User should see the role from the select role dropdown list
And Enters a valid userid "<userid>"
And Enters a valid password "<password>"
And Click on Signin button
Then Check background Questions
Then validate login is successful
Then Check Important Notice Dialog
Then Dashboard menu item dispaly is display
And Verify the signout button is visible
And Clicks on signout to leave the Dashboard page
Then Verifies the signout is successful

Examples:
| role       | userid 	| password 	 |test|
| Portal (1) | cm	      | Password1* |1015|
| Portal (2) | cr	      | Password1* |1016|