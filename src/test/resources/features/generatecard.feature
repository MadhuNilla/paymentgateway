Feature: Generate a credit card
  @credit
  Scenario: user wants to generate a credit card
    Given User should be on payment gateway homepage
    When  User clicks the Genarate card number
    Then  User gets a message says "Here is your New Card" with all card details