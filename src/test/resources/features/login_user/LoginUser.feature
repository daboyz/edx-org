Feature: Login user
  In order to have access to all courses
  As an EDX user
  I want to be able to log in

  Scenario Outline: Login user success
    Given the user is on the landing page
    When the user logs in as <username>
    Then they should see the <userinfo> displayed in upper right corner
    Examples:
| username                  | userinfo   |
| humaninterfaced@gmail.com | ashashukqa |