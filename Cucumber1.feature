Feature: Test Calculator

Scenario: Add two numbers

Given I enter 50
And I press add
And I have entered 50
When I press equal
Then result should be 100
