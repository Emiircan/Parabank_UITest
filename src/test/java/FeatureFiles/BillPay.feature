Feature: Bill Pay Func

  Background:
    Given Navigate to parabank page
    And User sending the keys in element
      | logUserName | Davut06 |
      | logPassword | 1234    |
    And Click on the element
      | logIn |
    Then User should login successfully

  @Regression
  Scenario Outline: Multiple invoice values payment
    And Click on the element
      | billPay |
    And User sending the keys in element
      | payeeName     | <billType> |
      | payeeAddress  | Altinsehir |
      | payeeCity     | Ankara     |
      | payeeState    | Turkiye    |
      | payeeZCode    | 06400      |
      | payeeNumber   | +999 77 44 |
      | payeeAccount  | 1111       |
      | payeeVAccount | 1111       |
      | payeeAmount   | <amount>   |
    And Click on the element
      | sendPayment |
    Then İnvoice payment has been made successfully

    Examples:
      | billType         | amount |
      | electricity bill | 95     |
      | water bill       | 50     |
      | phone bill       | 20     |
      | natural gas bill | 134    |