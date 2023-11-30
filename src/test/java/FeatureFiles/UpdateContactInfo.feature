Feature: Update contact information Func

  Background:
    Given Navigate to parabank page
    And User sending the keys in element
      | logUserName | Davut06 |
      | logPassword | 1234    |
    And Click on the element
      | logIn |
    Then User should login successfully

  @Regression
  Scenario: Update contact information
    And Click on the element
      | contactInfo |
    And User sending the keys in element
      | fName   | Davut     |
      | lName   | Elmas     |
      | address | Sinpas    |
      | city    | Ankara    |
      | state   | Turkiye   |
      | zCode   | 06514     |
      | pNumber | +999 7744 |
    And Click on the element
      | updateProfile |
    Then Profile update has occurred