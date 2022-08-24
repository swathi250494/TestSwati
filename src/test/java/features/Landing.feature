
@retest
Feature: Verify the registration page
  I want to use this template for my feature file

 @smoke
  Scenario: Verify the contents
    Given user launches registration page
    And observes the contents
    Then close browser
    
   
  Scenario: Verify user s able to navigate any link
    Given user launches registration page
    And click on "WebTable" link
    Then close browser
    @smoke
    Scenario: Verify user s able to navigate any home page
    Given user launches registration page
    And click on "Home" link
