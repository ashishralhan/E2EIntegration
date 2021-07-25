Feature: Test End to End Login with valid shopping flow



@Smoke
Scenario: Test the happy flow with valid credentials 
Given user is on login page 
When user enters username 
And  user enters password 
And user clicks on signin button
Then user should be logged in 



@Sanity @Regression @Smoke
Scenario: Test the happy flow with invalid credentials 
Given user is on login page 
When user enters username 
And  user enters password 
And user clicks on signin button
Then user should be logged in 


