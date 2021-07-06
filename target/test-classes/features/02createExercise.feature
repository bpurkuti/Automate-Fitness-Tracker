Feature: Admin is able to create an exercise

  Scenario Outline: Admin login and access the create exercise page
    Given The User is on the login page
    When The User enters <username> into the username field
    When The User enters <password> into the password field
    When The User clicks on the sign-in button
    Then The greeting should say <greeting>
    Then The title should be <title>
    Examples:
      | username | password | greeting | title |
      | "admin" | "admin" | "Welcome System Admin" | "Create Exercise" |

  Scenario Outline: Admin creates a new exercise
    Given The User is on the create exercise page
    When The User enters <exercise> into the exercise name field
    When The User selects the exercise type <type>
    When The User enters <video> into the video link field
    When The User enters <description> into the description field
    When The User clicks on the submit button
    Then The title should be <title>
    Examples:
      | exercise | type | video | description | title |
      | "Jogging" | "Cardio" | "https://www.youtube.com/embed/dQw4w9WgXcQ" | "Test Description" | "Create Exercise" |
      | "Leg Press" | "Strength" | "https://www.youtube.com/embed/dQw4w9WgXcQ" | "Test Description" | "Create Exercise" |
      | "Full Leg Stretch" | "Stretch" | "https://www.youtube.com/embed/dQw4w9WgXcQ" | "Test Description" | "Create Exercise" |

  Scenario Outline: Admin fails to create a new exercise
    Given The User is on the create exercise page
    When The User enters <exercise> into the exercise name field
    When The User selects the exercise type <type>
    When The User enters <video> into the video link field
    When The User enters <description> into the description field
    When The User clicks on the submit button
    Then The title should be <title>
    Then An error alert should appear
    Examples:
      | exercise | type | video | description | title |
      | "" | "Cardio" | "https://www.youtube.com/embed/dQw4w9WgXcQ" | "Test Description" | "Create Exercise" |
      | "Jogging" | "Cardio" | "" | "Test Description" | "Create Exercise" |
      | "Jogging" | "Cardio" | "https://www.youtube.com/embed/dQw4w9WgXcQ" | "" | "Create Exercise" |

  Scenario Outline: Admin fails to create a new exercise, leaving out exercise type
    Given The User is on the create exercise page
    When The User enters <exercise> into the exercise name field
    When The User enters <video> into the video link field
    When The User enters <description> into the description field
    When The User clicks on the submit button
    Then The title should be <title>
    Then An error alert should appear
    Examples:
      | exercise | video | description | title |
      | "Jogging" | "https://www.youtube.com/embed/dQw4w9WgXcQ" | "Test Description" | "Create Exercise" |

  Scenario Outline: User is able to logout
    Given The User is on the dashboard page
    When The User clicks on the logout button
    Then The title should be <title>
    Examples:
      | title |
      | "Login" |