Feature: TestMeAPP

Scenario: Registration Process
Given open TestMeAPP
Then click signup
Then Enter username as "Ajayabiramhem"
Then Enter firstname as "Ajay"
Then Enter lastname as "Kumar"
Then Enter password as "Ajay1234"
Then Enter againpassword as "Ajay1234"
Then Enter Gender
Then Enter email as "ajay123@gmail.com"
Then Enter mobile as"1234567890"
Then Enter dob as "15/05/1997"
Then Enter add as "xyz-636001"
Then Enter securityQuestion
Then Enter security answer
Then register
Then quit