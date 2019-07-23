Feature: Test Calculator

Scenario: Add two numbers

Given I enter 5200
And I press add
And I have entered 100
When I pressed equal
Then result should be 5300
