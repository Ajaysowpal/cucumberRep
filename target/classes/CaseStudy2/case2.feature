Feature: Testing User

Scenario Outline: Testing Valid Users

Given open the app
Then click signin
Then type "<username>"
And types "<password>"
Then clickLogin
Then clickLogout

Examples:
|username|password   |
|AlexUser|Alex@123   |
|Lalitha |password123|
