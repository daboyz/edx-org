Feature: Login user
  In order to have access to all courses
  As an EDX user
  I want to be able to log in

  Scenario Outline: Login user success
    Given user is on landing page
    When user logs in as <username>
    Then they should see <userinfo> displayed in upper right corner
    Examples:
| username  | userinfo   |
| testuser1 | ashashukqa |