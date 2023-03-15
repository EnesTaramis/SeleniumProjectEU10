Feature: Logout Functionality
  Agile story: As a user, I should be able to log out and end up on the log in page.

Background:
  When user is already logged in

  @wip
  Scenario: User can log out and ends up in login page.
    When user clicks the logout button
    Then user should land on the login page