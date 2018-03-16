Feature: Verify Credit Card Limit

  Scenario Outline: User wants to check balanace with used card
    Given User should be on payment gateway homepage
    When User clicks the Check Credit card Limit
    And  User enters the card number "<card number>"
    And  User clicks the submit button
    Then User can view the credit card balance with message says "Check Credit Balance"
    Examples:
      | card number      |
      | 4970823566391143 |
      | 4625477989893984 |
      | 4540107995116136 |


  Scenario Outline: User wants to check balance without used card
    Given User should be on payment gateway homepage
    When User clicks the Check Credit card Limit
    And  User enters the card number "<card number>"
    And  User clicks the submit button
    Then User can view the credit card balance with message says "This Card Not Any Transactions"
    And  User wants to go back to home page
    Examples:
      | card number      |
      | 1234526758999999 |
      | 2312786543231901 |


  @checkbal
 Scenario Outline: User wants to check card limit with invalid card digits
   Given User should be on payment gateway homepage
   When User clicks the Check Credit card Limit
   And  User enters the card number "<card num>"
   Then User gets an error message says "<text>"
 Examples:
   | card num   | text                               |
   | 43         | Please Input Correct 16 Digit.     |
   | 0000000000 | Please Input Correct 16 Digit.     |
   | @$$        | Special characters are not allowed |
   | fgffffgg   | Characters are not allowed         |
