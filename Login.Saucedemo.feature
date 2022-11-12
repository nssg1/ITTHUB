Feature: validating Login functionality of the sauce demo application


@TS_1
  Scenario: : Login with standard user and buy 1 item and checkout and see the order confirmation message
    Given user navigates to application page
   When user provides valid login details
   And  user navigates to homage and able to buy an item and checkout
    Then user successfully see the orderconfirmation message

  @TS_2
Scenario: Login with the standard user and go to the details of the product and see the order confirmation message
  Given user navigates to application page
  When user provides valid login details
  And user navigates to homage and  see the details of the product and able to buy an item and checkout
  Then user successfully see the orderconfirmation message

    @TS_3
    Scenario: Login with standard user and buy two items and checkout with order confirmation message
     Given user navigates to application page
      When user provides valid login details
      And user navigates to homage and able to buy two items and checkout
      Then user successfully see the orderconfirmation message

  @TS_4
  Scenario: Login with standard user and add two items in the cart and remove one item and checkout and see the order confirmation message
    Given user navigates to application page
    When user provides valid login details
    And user navigates to homage and adds two items in cart and remove an item and checkout
    Then user successfully see the orderconfirmation message

  @TS_5
  Scenario: Login with locked_out_user an error message is displayed - Epic sadface:sorry, this user has been locked out
    Given user navigates to application page
    When user provides valid login details i.e, locked_out_user
    And user should not be able to login
    Then user should get error message

  @TS_6
  Scenario: Login with problem_user and buy an item and see the order confirmation message
    Given user navigates to application page
    When user provides valid login details i.e, problem_user
     And user navigates to homage and able to buy an item and checkout
    Then user successfully see the orderconfirmation message

  @TS_7
  Scenario: Login with performance_glitch_user and buy an item and checkout with confirmation message
    Given user navigates to application page
    When user provides valid login details i.e, performance_glitch_user
    And user navigates to homage and able to buy an item and checkout
    Then user successfully see the orderconfirmation message

