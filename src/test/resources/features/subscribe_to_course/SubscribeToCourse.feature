Feature: Subscribe to course
  In order to study better
  As an EDX user
  I want to be able to subscribe to courses

  Scenario Outline: Subscribing to course
    Given the user is on the EDX home page
    When the user looks up the course by the keyword '<keyword>' AND presses Subscribe button
    Then they should be subscribed to the course '<course>'
    
    Examples:
| keyword | course |
| python  | Python course description |
| java    | Java course description |
