Feature: Checkout Payment

  @test @positive
  Scenario: Payment successfully
    Given user already on Checkout: Your Information page
    When user fill first name with "test"
    And user fill last name with "feature"
    And user fill zip postal code with "A5743"
    When user click on continue button
    Then checkout: overview page should be appear
    And item name will appear
    And item quantity will appear
    And item payment information will appear
    And item shipping information will appear
    And item total price will appear
    And user click on finish button
    Then checkout completed