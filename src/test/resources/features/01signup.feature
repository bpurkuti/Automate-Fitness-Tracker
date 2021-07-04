Feature: User is able to create an account

  Scenario Outline: Successful Account creation
    Given The User is on the sign-up page
    When The User enters <firstname> into the firstname field
    When The User enters <lastname> into the lastname field
    When The User enters <username> into the username field
    When The User enters <password> into the password field
    When The User enters <height> into the height field
    When The User enters <weight> into the weight field
    When The User enters <gender> into the gender field
    When The User enters <age> into the age field
    When The User clicks on the sign-up button
    Then The title should be <title>
    Examples:
      | firstname | lastname | username | password | height | weight | gender | age | title |
      | "Wolf"  | "Ryan" | "wryan" | "pass" | "75" | "175" | "male" | "24" | "Dashboard" |
      | "Johnny" | "Test" | "jtest" | "pass" | "" | "" | "female" | "16" | "Dashboard" |


  Scenario Outline: Unsuccessful Account creation
    Given The User is on the sign-up page
    When The User enters <firstname> into the firstname field
    When The User enters <lastname> into the lastname field
    When The User enters <username> into the username field
    When The User enters <password> into the password field
    When The User enters <height> into the height field
    When The User enters <weight> into the weight field
    When The User enters <gender> into the gender field
    When The User enters <age> into the age field
    When The User clicks on the sign-up button
    Then A login alert should appear
    Then The title should be <title>
    Examples:
      | firstname | lastname | username | password | height | weight | gender | age | title |
      | "" | "" | "jtest" | "notpass" | "" | "" | "" | "" | "Sign up" |
      | "Johnny" | "" | "jtest" | "notpass" | "" | "" | "" | "" | "Sign up" |
      | "Johnny" | "Test" | "" | "notpass" | "" | "" | "" | "" | "Sign up" |

  Scenario Outline: Go back to the sign-in page
    Given The User is on the login page
    When The User clicks on the sign-up button
    Then The title should be <title>
    When The User clicks on the sign-in button
    Then The title should be <title2>
    Examples:
      | title | title2 |
      | "Sign up" |  "Login" |