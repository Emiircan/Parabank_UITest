Feature: Loan Request Func

  Background:
    Given Navigate to parabank page
    And User sending the keys in element
      | logUserName | Davut06 |
      | logPassword | 1234    |
    And Click on the element
      | logIn |
    Then User should login successfully

  @Regression
  Scenario: Valid loan request application
    And Click on the element
      | requestLoan |
    And User sending the keys in element
      | loanAmount      | 50 |
      | loanDownPayment | 10 |
    And Click on the element
      | applyNow |
    Then Loan application process completed successfully

  @Regression
  Scenario:Invalid loan request application
    And Click on the element
      | requestLoan |
    And User sending the keys in element
      | loanAmount      | 5000 |
      | loanDownPayment | 10   |
    And Click on the element
      | applyNow |
    Then The loan application process was not completed successfully