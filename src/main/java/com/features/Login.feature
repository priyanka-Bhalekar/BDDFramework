Feature: VIU login feature
Scenario: VIU login Test Scenario

Given user is already in login page
When title of login page is VIU
Then user enters user name and password
Then user clicks on login button
Then user is on home page