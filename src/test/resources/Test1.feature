@Test1
Feature: Test 1

  Scenario Outline: Test 1
    Given I go to the selenium homepage
    When I search for "<searchTerm>"
    Then I see a custom google search result page for "<searchTerm>"
    And another steps

    Examples: 
      | searchTerm |
      | api        |
      | selenium   |
