Feature: Test Calculator

Scenario Outline: Add two numbers

Given I enter <operand1>
And I press add
And I have entered <operand2>
When I pressed equal
Then result should be <result>


    Examples: 
      | operand1 | operand2 | result  |
      | 10       |     5    | 15      |
      | 20       |     5    | 25      |
