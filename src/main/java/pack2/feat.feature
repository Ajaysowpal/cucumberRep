Feature: Test Calculator

Scenario: Add two numbers

Given I enter 50
And I press add
And I have entered 50
When I press equal
Then result should be 100

Scenario: sum two numbers
Given I enter 20
And I press sub
And I have entered 10
When I press equals
Then result should be 10