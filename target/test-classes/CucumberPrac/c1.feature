#Author: your.email@your.domain.com

@tag
Feature: Title of your feature
  I want to use this template for my feature file

 Background:
 Given Invoke Driver

  @tag2
  Scenario Outline: Neg Test for login
  
    Given I land on page
    When I logged in w/ username <name> and password <pass>
    Then I will get "Incorrect email or password." message

     Examples: 
      | name             | pass       |
      | adil03@gmail.com | Adil123@!  | 
