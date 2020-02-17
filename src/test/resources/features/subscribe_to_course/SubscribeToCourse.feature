Feature: Subscribe to course
  In order to study better
  As an EDX user
  I want to be able to subscribe to courses

  Scenario Outline: Check current courses
    Given the user is logged in
    When the user goes to courses page
    Then they should see the <category> is more than <lower_limit> and less than <upper_limit>
    Examples:
| category | lower_limit | upper_limit |
| current  | 1000        | 2000        |