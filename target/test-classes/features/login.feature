Feature: User is able to login

  Scenario Outline: Login refused due to bad credentials
    Given The User is on the login page
    When The User enters <username> into the username field
    When The User enters <password> into the password field
    When The User clicks on the sign-in button
    Then An alert should say <alert>
    Then The title should be <title>
    Then The username field should be empty
    Then The password field should be empty

    Examples:
      | username | password | alert | title |
      | "notauser" | "notapass" | "Please enter a valid username and password." | "Login" |

  Scenario Outline: Login to the employee reimbursement application
    Given The User is on the login page
    When The User enters <username> into the username field
    When The User enters <password> into the password field
    When The User clicks on the sign-in button
    Then The title should be <title>


    Examples:
      | username | password | title |
      | "wryan" | "pass" | "Routines" |
      | "jtest" | "pass" | "Routines" |

  Scenario Outline: Access the sign-up page
    Given The User is on the login page
    When The User clicks on the sign-up button
    Then The title should be <title>

    Examples:
      | title |
      | "Signup" |
