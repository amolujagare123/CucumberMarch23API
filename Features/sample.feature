Feature: all login scenarios

  Background: this is back ground
    When I open browser
    And  I maximize it

  @login
  Scenario: To test the functionality of login page for valid inupt
    Given I am on login page
   # When I enter username and password
   # When I enter correct username and correct password
    When I enter username as "admin" and password as "admin123"
    And I click on login button
    Then I should be at home page

  @login
  Scenario: To test the functionality of login page for invalid inupt
    Given I am on login page
  #  When I enter username and password
  #  When I enter incorrect username and incorrect password
    When I enter username as "xyz" and password as "abc"
    And I click on login button
    Then I should be at home page

  @login
  Scenario: To test the functionality of login page for blank inupt
    Given I am on login page
  #  When I enter username and password
  #  When I enter blank username and blank password
    When I enter username as "" and password as ""
    And I click on login button
    Then I should be at home page


    @chatServer
  Scenario: Verify chat server user is created successfully
    Given Add User Payload for is created with below data
      | amitp | am123 | amit | patil | a@b.com | a123 |
      When user calls "AddUser" with "POST" http request
    Then the API call got success with status code "201"

      @SampleUser
  Scenario Outline: Verify user is created successfully
    Given Add User Payload for is created with <name> and <job>
        When user calls "AddUser" with "POST" http request
        Then the API call got success with status code "201"
        And response time must be less than 200 milli seconds
        Examples:
          | name   | job  |
          | amit   | Test |
          | amol   | Dev  |
          | vishal | HR   |
