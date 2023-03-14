Feature: Login Functionality
  Agile Story: As a user, when I am on the Fidexio login page, I should
  be able to login using valid credentials.

  Background:
    Given Fidexio webpage is open

  Scenario Outline: Both sales manager and pos manager should be able to login with valid credentials
    When user enters valid "<email>" and user enters valid "<password>"
    Then user should be able to login

    Examples:
      | email                   | password     |
      | salesmanager15@info.com | salesmanager |
      | posmanager10@info.com   | posmanager   |

  @wip
  Scenario Outline: "Please fill out this field" message should be displayed if the username or password field is empty
    When user enters only an "<email>" or "<password>"
    Then  user should see warning message to fill empty fields when trying to log in
    Examples:
      | email                   | password   |
     | salesmanager15@info.com |            |
      |                         | posmanager |
      |                         |            |


