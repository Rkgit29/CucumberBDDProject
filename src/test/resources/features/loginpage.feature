Feature:  facebook login feature

  Background: pre condition
    Given I am the user of facebook application

  @tag1
  Scenario: Validate valid login scenario
    When I enter valid username
    And  I enter valid password
    And I click on login button
    Then I should be able to login successfully

  @tag2
  Scenario: Validate invalid login scenario
    When I enter invalid username
    And  I enter invalid password
    And I click on login button
    Then I should not be able to login successfully

