@Test2
Feature: Test 2

  Scenario Outline: Test 1
    Given I go to the selenium homepage
    When I search for "<searchTerm>"
    Then I see a custom google search result page for "<searchTerm>"
    And another steps

    Examples: 
      | searchTerm |
      | api        |
      | selenium   |

  Scenario Outline: Test 2
    Given I go to the selenium homepage
    Then the page title is "<pageTitle>"
    And the text on the page is displayed

    Examples: 
      | pageTitle                         |
      | Selenium - Web Browser Automation |
