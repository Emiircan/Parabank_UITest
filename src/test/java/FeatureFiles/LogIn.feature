Feature: Login Func

  Background:
    Given Navigate to parabank page

  @Regression
  Scenario Outline: Login with valid username and password
    When Enter username "<username>" and password "<password>" and click login button
    Then User should login successfully

    Examples:
      | username | password |
      | Davut06  | 1234     |

  @Regression
  Scenario Outline: Log in with in valid username and password
    When Enter username "<username>" and password "<password>" and click login button
    Then User should login successfully

    Examples:
      | username | password |
      | Dav      | 1234     |
      | Davut06  | 124234   |