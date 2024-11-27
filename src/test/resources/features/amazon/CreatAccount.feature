Feature: Create amazon account

  Background:
    Given I am on the amazon web page
    When I will click on signIn button
    Then I will click on Create amazon account button

  Scenario Outline: Succesfully create acccount with valid email
    When I will enter "<FullName>" as value for your name field
    And I will enter "<Email>" as value for email field
    And I will enter "<password>" as a valid password value for password field
    And I will re-enter "<re-enter>" as a valid password value for re-enter password field
    Then I click on verify email button
    And I should be navigated to OPT page
    And I enter the valid OTP
    Then I click on create your amazon account button
    And I should see the amazon dashboard

    Examples:
      | FullName | Email |  password |  re-enter |
      | JohnDoe  | John@gmail.com | John@123@123 | John@123@123 |

  Scenario: Succesfully create acccount with valid phone number
    And I will enter "John" as value for your name field
    And I will enter "(555) 555-1234" as value for phone number field
    And I will enter "John@@!@#" as a valid password value for password field
    And I will re-enter "John@@!@#" as a valid password value for re-enter password field
    Then I click on verify mobile number button
    And I should be navigated to OPT page
    And I enter the valid OTP
    Then I click on create your amazon account button
    And I should see the amazon dashboard

  Scenario: Succesfully create acccount with valid phone number
    Given I am on the amazon web page
    When I will click on signIn button
    Then I will click on Create amazon account button
    And I will enter username as value for your name field
    And I will enter phone number as value for phone number field
    And I will enter password as a valid password value for password field
    And I will re-enter the password as a valid password value
    Then I click on verify mobile number button