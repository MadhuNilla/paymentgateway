Feature: Buy a product
  @smoke
  Scenario Outline: User wants to buy a product with valid details
    Given User should be on payment gateway homepage
    When  User clicks the cart button
    And   User selects the Quantity
    And   User clicks the BuyNow button
    And   User enters the Card details "<creditcardnumber>","<expiryMonth>","<expiryYear>","<cvv>"
    And   User clicks the Paynow
    Then  User get a message says "Payment successfull!"
Examples:
  | creditcardnumber | expiryMonth | expiryYear | cvv |
  | 4970823566391143 | 3           | 2025       | 366 |
  | 4625477989893984 | 7           | 2020       | 550 |
  | 4540107995116136 | 12          | 2019       | 768 |

 Scenario Outline: User wants to buy a product with invalid details
   Given User should be on payment gateway homepage
   When  User clicks the cart button
   And   User selects the Quantity
   And   User clicks the BuyNow button
   And   User enters the Card details "<creditcardnumber>","<expiryMonth>","<expiryYear>","<cvv>"
   And   User clicks the Paynow
   Then  User get a message says "Enter valid card details"

   Examples:
     | creditcardnumber | expiryMonth | expiryYear | cvv |
     | 2345677667778787 | 7           | 2021       | 123 |
#     | 1235667788899998 | 12          | 2017       | 211 |


