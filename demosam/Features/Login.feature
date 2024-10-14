
Feature: User Login

  Scenario: Successful Login
    Given User is on login page
    When user enters valid crdentials (username: "sha@codewalla.com", password: "g@met!meOnce@gain")
    And User click on the login button
    And user should be logged in
   