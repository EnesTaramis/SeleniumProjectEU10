@FID10-389
Feature: Logout Functionality
  Agile story: As a user, I should be able to log out and end up on the log in page.

Background:
  #@FID10-385
  Given user is already logged in

  @FID10-387 @FID10-391
  Scenario: User can log out and ends up in login page.
    When user clicks the logout button
    Then user should land on the login page

  @FID10-388 @FID10-391
  Scenario: The user can not go to the home page again by clicking the step back button after successfully logged out.
    Given user has logged out
    When user presses the backspace button after loggin out
    Then user can not go to the homepage again