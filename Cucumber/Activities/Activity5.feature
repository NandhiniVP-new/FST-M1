@Acitivity05
Feature: Data driven test without Example

Scenario Outline: Testing with Data from Scenario
    Given User is on Login page
    When User enters "<Username>" and "<Passwords>"
    And Clicks Submit
    Then Read the page title and confirmation message
    And Close the Browser