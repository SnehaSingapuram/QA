#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@tag
Feature: Test Facebook Smoke Scenario
	I want to use this template for my feature file

@tag1
Scenario: Login with valid credentials
Given Open Chrome and start application  
When I enter vaild username and valid password
Then user should login successfully
	

@tag2
Scenario Outline: Enter the Details of the User to create an account
Given Open Chrome and start application  
When Enter valid First Name, Last Name, Mobile or Email, Birth date and Password
Then User should create the account successfully


