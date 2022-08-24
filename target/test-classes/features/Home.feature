@shoba
Feature: Validate HomePage

  Background: 
    Given user launches browser
    When enters url
@smoke
  Scenario: Check the acccess of the page
    Then check the title
@retest
  Scenario: Check the links displaying in the header section
    Then Check the links in the header section
      | Home  | About us | Contact | Log in | Sign up |
@regression
  Scenario Outline: Check login functionality
    And click on login link
    And Enter <username> and <password>
    Then user logs succesfully

    Examples: 
      | username | password |
      | 'demo'   | 'demo'   |
      | 'demo1'  | 'hello'  |
