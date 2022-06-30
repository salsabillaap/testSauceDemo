Feature: Checkout Payment

  @positive
  Scenario: Payment successfully
    Given user already on Checkout: Your Information page
    When user click on continue button
    Then checkout: overview page should be appear
    And item name will appear
    And item quantity will appear
    And item payment information will appear
    And item shipping information will appear
    And item total price will appear
    And user click on finish button
    Then checkout completed


   @positive
   Scenario: Cancel payment
     Given user already on Checkout: Overview page
     When user click on cancel button on overview
     Then return to homepage

   @positive
   Scenario: Return to cart page by cart icon
     Given user already on Checkout: Overview page
     When user click on cart icon on overview
     Then return to cart page