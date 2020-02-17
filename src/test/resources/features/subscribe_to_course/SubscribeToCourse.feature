Feature: Subscribe to course
  In order to study better
  As an EDX user
  I want to be able to subscribe to courses

  Scenario Outline: Subscribe to course
    Given user is logged in
    When user goes to courses page
    When user searches for course <course>
    When user opens course page from grid
    When user enrolls to course
    Then they should be able to start course
    When user unenrolls from course
    Then they should not see <course> on dashboard
    Examples:
| course                  |
| Python for Data Science |