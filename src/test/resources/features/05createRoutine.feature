Feature: User is able to create a routine

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
      | "jtest" | "pass" | "Welcome Johnny Test" | "Create Routine" |

  Scenario Outline: The User starts to create a routine
    Given The User is on the create routine page
    When The User enters <name> into the routine name field
    Examples:
      | name |
      | "Monday morning routine" |

  Scenario Outline: Attempt to create exercises for the new routine
    When The User selects the exercise filter <type>
    When The User selects an exercise <exercise>
    When The User selects the date <date>
    When The User clicks on the add button
    Examples:
      | type | exercise | date |
      | "Stretch" | "Full Leg Stretch" | "07/09/2021" |
      | "Cardio" | "Jogging"    | "07/09/2021" |
      | "Strength" | "Leg Press" | "07/09/2021" |


  Scenario Outline: User creates the new routine
    When The User clicks on the create button
    Then The title should be <title>
    Examples:
      | title |
      | "Create Routine" |

  Scenario Outline: User fails to create an empty routine
    Given The User is on the create routine page
    When The User enters <name> into the routine name field
    When The User clicks on the create button
    Then The title should be <title>
    Then An error alert should appear
    Examples:
      | name | title |
      | "I'm gettin' ripped tonight" | "Create Routine" |


  Scenario Outline: User able to go home
    Given The User is on the create routine page
    When The User clicks the home button
    Then The title should be <title>
    Examples:
      | title |
      | "Dashboard" |


  Scenario Outline: User is able to logout
    Given The User is on the create routine page
    When The User clicks on the logout button
    Then The title should be <title>
    Examples:
      | title |
      | "Login" |
