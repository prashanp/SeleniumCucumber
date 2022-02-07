Feature: As a user i should be able to login into the application

  Scenario: As a user I am able to login into the application with my credentials

    Given URL of the application should be open.
    When The user navigates to the login page.
    Then The user enters his credentials username - "hammamiehfiras34@gmail.com" and Password - "Firas@123"
    And The user should be logged in.


  Scenario: As a user I am not able to login into the application with my credentials

    Given URL of the application should be open.
    When The user navigates to the login page.
    Then The user enters his credentials username - "smith" and Password - "Random"
    And The user should be logged in.


  Scenario: As a user I am not able to login into the application with my credentials

    Given URL of the application should be open.
    When The user navigates to the login page.
    Then The user enters his credentials username - "hammamiehfiras34@gmail.com" and Password - "Random"
    And The user should be logged in.