Feature: Login

  Scenario: User success login
      Given the user is already on the login page
      When input valid username "standard_user"
      And input valid password "secret_sauce"
      And click login button
      Then go to inventory page

    Scenario: User failed login1
        Given user is already on the login page
        When input validd username "standard_user"
        And input invalid password "12345"
        And click loginn button
        Then should be error message appear

    Scenario: User failed login2
        Given already on the login page
        When input invalid username "standard user"
        And input validd password "secret_sauce"
        And click loginnn button
        Then display error message

    Scenario: User failed login3
        Given User is already on the login page
        When input invalidd username "standard user"
        And input invalidd password "secret123"
        And click loginnnn button
        Then error message