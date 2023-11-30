Feature: Register Func

  @Smoke
  Scenario Outline:New Member Registration
    Given Navigate to parabank page
    And Click on the element
      | register |
    And User sending the keys in element
      | fName       | Davut      |
      | lName       | Elmas      |
      | address     | Sinpas     |
      | city        | Ankara     |
      | state       | Tr         |
      | zCode       | 06514      |
      | pNumber     | +999 7744  |
      | ssn         | sss        |
      | regUserName | <username> |
      | regPassword | 1234       |
      | confirm     | 1234       |
    And Click on the element
      | centerRegister |
    Then User should register successfully "<username>"

    Examples:
      | username |
      | Davut06  |

  @Smoke
  Scenario Outline: New Member Registration with Existing Username
    Given Navigate to parabank page
    And Click on the element
      | register |
    And User sending the keys in element
      | fName       | Davut      |
      | lName       | Elmas      |
      | address     | Sinpas     |
      | city        | Ankara     |
      | state       | Tr         |
      | zCode       | 06514      |
      | pNumber     | +999 7744  |
      | ssn         | sss        |
      | regUserName | <username> |
      | regPassword | 1234       |
      | confirm     | 1234       |
    And Click on the element
      | centerRegister |
    Then User should not registered successfully


    Examples:
      | username |
      | Davut06  |