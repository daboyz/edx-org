Feature: Subscribe to course
  In order to study better
  As an EDX user
  I want to be able to subscribe to courses

  Scenario Outline: Check current courses
    Given the user is logged in
    When the user goes to courses page
    Then they should see the Current is more than 1000 and less than 2000
    Examples:
| category | course |
| python  | Python course description |
| java    | Java course description |