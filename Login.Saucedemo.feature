Feature: validating Login functionality of the sauce demo application

  Scenario: : Login with standard user and buy 1 item and checkout and see the order confirmation message
    Given user navigates to application page
    When user provides valid login details
    And  user navigates to homage and able to buy an item and checkout
    Then user successfully see the orderconfirmation message


