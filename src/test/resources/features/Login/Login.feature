#Author: gadotey@outlook.com
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
@OpenEMR @login-dashboard
Feature: Login into the OpenEMR main dashboard
  I want able to log intot he OpenEMR dashboard as the Administrotor

  @SmokeTest @adminlogin @test-seq-1
  Scenario Outline: Login as the valid user
    Given I navigate to the OpenEMR login page
    When I enter the <userName> and <passWord>
    And I click on the submit button
    Then I verify the  dash board have the following items

    Examples: 
      | userName | passWord |
      | admin    | pass     |
