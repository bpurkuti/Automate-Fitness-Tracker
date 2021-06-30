Feature: User is able to create an account

  Scenario Outline: Successful Account creation
    Given The User is on the sign-up page
    When The User enters <firstname> into the firstname field
    When The User enters <lastname> into the lastname field
    When The User enters <username> into the username field
    When The User enters <password> into the password field
    When The User enters <confirmPassword> into the confirm password field
    When The User enters <height> into the height field
    When The User enters <weight> into the weight field
    When The User selects the sex <sex>
    When The User enters <age> into the age field
    When The User clicks on the sign-up button
    Then The title should be <title>

    Examples:
      | firstname | lastname | username | password | confirmPassword | height | weight | sex | age | title |
      | "Bobby"  | "Jones" | "bjones" | "pass" | "pass" | "75" | "175" | "male" | "24" | "Routines" |
      | "Johnny" | "Test" | "jtest" | "pass" | "pass" | "" | "" | "" | "female" | "Routines" |


  Scenario Outline: Unsuccessful Account creation
    Given The User is on the sign-up page
    When The User enters <firstname> into the firstname field
    When The User enters <lastname> into the lastname field
    When The User enters <username> into the username field
    When The User enters <password> into the password field
    When The User enters <confirmPassword> into the confirm password field
    When The User enters <height> into the height field
    When The User enters <weight> into the weight field
    When The User selects the sex <sex>
    When The User enters <age> into the age field
    When The User clicks on the sign-up button
    Then An alert should say <alert>
    Then The title should be <title>
    Examples:
      | firstname | lastname | username | password | confirmPassword | height | weight | sex | age | alert | title |
      | "" | "" | "jtest" | "pass" | "pass" | "" | "" | "" | "" | "Please enter data into all required fields" | "Signup" |
      | "Johnny" | "Test" | "jtest" | "pass" | "notpass" | "" | "" | "" | "" | "Please enter data into all required fields" | "Signup" |
      | "Johnny" | "Test" |  | "pass" | "notpass" | "" | "" | "" | "" | "Please enter data into all required fields" | "Signup" |

  Scenario Outline: Go back to the sign-in page
    Given The User is on the login page
    When The User clicks on the sign-up button
    Then The title should be <title>
    When The User clicks on the sign-in button
    Then The title should be <title2>

    Examples:
      | title | title2 |
      | "Signup" |  "Login" |