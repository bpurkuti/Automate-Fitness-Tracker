Feature: User is able to create an account

  Scenario Outline: Access the sign-up page
    Given The User is on the login page
    When The User clicks on the sign-up button
    Then The title should be <title>

    Examples:
      | title |
      | Sign Up |

  Scenario Outline: Successful Account creation
    Given The User is on the sign-up page
    When The User enters <firstname> into the firstname field
    When The User enters <lastname> into the lastname field
    When The User enters <username> into the username field
    When The User enters <password> into the password field
    When The User enters <confirmPassword> into the confirm password field
    When The User enters <height> into the height field
    When The User enters <weight> into the weight field
    When The User selects <sex> from the sex dropdown
    When The User enters <age> into the age field
    When The User clicks on the sign-up button
    Then Then The title should be <title>

    Examples:
      | firstname | lastname | username | password | confirmPassword | height | weight | sex | age | title |
      | Wolf  | Ryan | wryan | pass | pass | 75 | 175 | M | 24 | Profile |
      | Johnny | Test | jtest | pass | pass |  |  |  |  | Profile        |


  Scenario Outline: Unsuccessful Account creation
    Given The User is on the sign-up page
    When The User enters <firstname> into the firstname field
    When The User enters <lastname> into the lastname field
    When The User enters <username> into the username field
    When The User enters <password> into the password field
    When The User enters <confirmPassword> into the confirm password field
    When The User enters <height> into the height field
    When The User enters <weight> into the weight field
    When The User selects <sex> from the sex dropdown
    When The User enters <age> into the age field
    When The User clicks on the sign-up button
    Then An alert should say <alert>
    Then Then The title should be <title>
    Examples:
      | firstname | lastname | username | password | confirmPassword | height | weight | sex | age | alert | title |
      |  |  | jtest | pass | pass |  |  |  |  | Please enter data into all required fields | Sign up |
      | Johnny | Test | jtest | pass | notpass |  |  |  |  | Please enter data into all required fields | Sign up |
      | Johnny | Test |  | pass | notpass |  |  |  |  | Please enter data into all required fields | Sign up |