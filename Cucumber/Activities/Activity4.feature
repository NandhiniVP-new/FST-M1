@activity4
Feature: Data driven test without Example
@logintest @loginSucess
Scenario: Testing with correct data from input
    Given the User is on Login page
    When User enters "admin" and "password"
    And Clicks the submit button
    Then get the confirmation text and verify message as "Welcome back Admin"
    