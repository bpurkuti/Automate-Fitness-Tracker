Feature: User is able to view/start a routine

  Scenario Outline: Login and view cardio routine
    Given The User is on the login page
    When The User enters <username> into the username field
    When The User enters <password> into the password field
    When The User clicks on the sign-in button
    Then The greeting should say <greeting>
    When The User clicks on a routine button <routine>
    Then The title should be <title>

    Examples:
      | username | password | greeting | routine | title |
      | "jtest" | "pass" | "Welcome Johnny Test" | "routine1" | "View/Start Routine" |

  Scenario Outline: User able to go back a page
    Given The User is on the view routine page
    When The User clicks the back button
    Then The title should be <title>
    Examples:
      | title |
      | "Profile" |

  Scenario Outline: Complete a cardio routine--CONTINUE ONCE FRONT END FINISHED--
    Given The User is on the profile page
    When The User clicks on a routine button <routine>
    Then The routine name should be <routine_name>
    Then The exercise name should be <exercise_name>
    Then The exercise description should say <exercise description>
    Then The video should exist
    Then The exercise duration should say <exercise_duration>
    When The User clicks on the start routine button
    Examples:
      | routine| routine_name | exercise_name | exercise description | exercise_duration |
      | "routine1" | "Daily Jog" | "Jogging" | "Generic Description Here" | "30"        |
      | "routine2" | "Jump Rope Fun" | "Jump Rope" | "Generic Description Here" | "15"      |



  Scenario Outline: User is able to logout
    Given The User is on the view routine page
    When The User clicks on the logout button
    Then The title should be <title>

    Examples:
      | title |
      | "Login" |

