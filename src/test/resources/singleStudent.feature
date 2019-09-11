@singleStudent
Feature: Single Student API automation

  Scenario: Single student attribute validation
    When user hits single student API with "http://cybertekchicago.com/student/1610"
    Then user tests for required attributes
    When user tests the title of the student
    Then user should validate the title is present
    When user tests the email
    Then user should validate the right email
