Feature: User is able to view/start a routine

  Scenario Outline: Login and access the create routine page
    Given The User is on the login page
    When The User enters <username> into the username field
    When The User enters <password> into the password field
    When The User clicks on the sign-in button
    Then The greeting should say <greeting>
    When The User clicks on the new routine button
    Then The title should be <title>

    Examples:
      | username | password | greeting | title |
      | "wryan" | "pass" | "Welcome Wolf Ryan"  | "Profile" |
      | "jtest" | "pass" | "Welcome Johnny Test" | "Profile" |

  Scenario Outline: Attempt to create a new cardio routine
    Given The User is on the create routine page
    When The User enters <name> into the routine name field
    When The User selects an exercise <exercise>
    When The User clicks on the add button
    Then The form to enter details should popup
    Then The exercise name should be <exercise_name>
    Then The exercise description should say <exercise description>
    Then The video should exist
    When The User enters <duration> into the duration field
    Then The title should be <title>
    Then An alert should say <alert>
    Examples:
      | name | exercise | exercise_name | exercise description | duration | title | alert |
      | "Daily Jog" | "Jogging" | "Jogging" | "Generic Description Here" | "30" | "Create Routine" | "Routine Creation Successful." |
      | "Jump Rope Fun" | "Jump Rope" | "Jump Rope" | "Generic Description Here" | "15" | "Create Routine" | "Routine Creation Successful." |
      | "Fail Test" | "" | "" | "" | "30" | "Create Routine" | "Error. Please Enter Data into all Available Fields." |

  Scenario Outline: Attempt to create a new weight training routine
    Given The User is on the create routine page
    When The User enters <name> into the routine name field
    When The User selects an exercise <exercise>
    When The User clicks on the add button
    Then The form to enter details should popup
    Then The exercise name should be <exercise_name>
    Then The exercise description should say <exercise description>
    Then The video should exist
    When The User enters <weight> into the weight field
    When The User enters <reps> into the reps field
    Then The title should be <title>
    Then An alert should say <alert>
    Examples:
      | name | exercise | exercise_name | exercise description | weight | reps | title | alert |
      | "Leg Day" | "Leg Press" | "Leg Press" | "Generic Description Here" | "250" | "15" | "Create Routine" | "Routine Creation Successful." |
      | "I'm Gettin' Ripped Tonight" | "Deadlift" | "Deadlift" | "Generic Description Here" | "400" | "1" | "Create Routine" | "Routine Creation Successful." |
      | "Fail Test" | "" | "" | "" | "" | "" | "Create Routine" | "Error. Please Enter Data into all Available Fields." |

  Scenario Outline: User able to go back a page
    Given The User is on the create routine page
    When The User clicks the back button
    Then The title should be <title>
    Examples:
      | title |
      | "Profile" |


  Scenario Outline: User is able to logout
    Given The User is on the create routine page
    When The User clicks on the logout button
    Then The title should be <title>

    Examples:
      | title |
      | "Login" |
