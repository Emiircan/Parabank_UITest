Feature: Bank Account Func

  Background:
    Given Navigate to parabank page
    And User sending the keys in element
      | logUserName | Davut06 |
      | logPassword | 1234    |
    And Click on the element
      | logIn |
    Then User should login successfully

  @Regression
  Scenario: Open a new bank account
    And Click on the element
      | newAccount |
    And The type of account you want to open"SAVINGS"
    # CHECKING or SAVINGS
    And Click on the element Action class
      | openAccount |
    Then The user has successfully opened a new account