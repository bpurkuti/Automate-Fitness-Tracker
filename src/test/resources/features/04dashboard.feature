Feature: User is able to access their dashboard

  Scenario Outline: Login and access the dashboard
    Given The User is on the login page
    When The User enters <username> into the username field
    When The User enters <password> into the password field
    When The User clicks on the sign-in button
    Then The title should be <title>
    Then The greeting should say <greeting>
    Examples:
      | username | password | title | greeting |
      | "wryan" | "pass" | "Dashboard" | "Welcome Wolf Ryan"  |
      | "jtest" | "pass" | "Dashboard" | "Welcome Johnny Test" |

  Scenario Outline: Access the create routine page
    Given The User is on the dashboard page
    When The User clicks on the new routine button
    Then The title should be <title>
    Examples:
      | title |
      | "Create Routine" |

  Scenario Outline: User is able to logout
    Given The User is on the dashboard page
    When The User clicks on the logout button
    Then The title should be <title>
    Examples:
      | title |
      | "Login" |