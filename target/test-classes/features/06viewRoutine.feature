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

  Scenario Outline: User able to go home
    Given The User is on the view routine page
    When The User clicks the home button
    Then The title should be <title>
    Examples:
      | title |
      | "Dashboard" |

  Scenario Outline: Access and view the routine again
    Given The User is on the dashboard page
    When The User clicks on a routine button <routine>
    Then The title should be <title>
    Then The routine name should be <routine_name>
    Examples:
      | routine | title | routine_name |
      | "routine1" | "View/Start Routine" | "Monday morning routine" |


  Scenario Outline: User enters data for cardio exercises
    When The User enters <duration> into the duration field
    Then The current exercise should say <exercise>
    Then The description should say <description>
    Then The video should exist
    Then The previous exercise should be <prev>
    Then The next exercise should be <next>
    When The User clicks on the complete exercise button
    Then The title should be <title>
    Examples:
      | duration | exercise | description | prev | next | title |
      | "30"     |  "Squats" | "Test description" | "" | "Bike" | "View/Start Routine" |
      | "20"     |  "Bike" | "Test description" | "Squats" | "Benchpress" | "View/Start Routine" |

  Scenario Outline: User enters data for the last muscle exercise
    When The User enters <weight> into the weight field
    When The User enters <sets> into the sets field
    When The User enters <reps> into the reps field
    Then The current exercise should say <exercise>
    Then The description should say <description>
    Then The video should exist
    Then The previous exercise should be <prev>
    Then The next exercise should be <next>
    When The User clicks on the complete exercise button
    Then The title should be <title>
    Then The history graph should contain routine <routine>
    Examples:
      | weight | sets | reps | exercise | description | prev | next | title | routine |
      | "250"  | "5"    | "10"   | "Benchpress" | "Test description" | "Bike" | "" | "Dashboard" | "Monday morning routine" |


  Scenario Outline: User is able to logout
    Given The User is on the view routine page
    When The User clicks on the logout button
    Then The title should be <title>
    Examples:
      | title |
      | "Login" |

