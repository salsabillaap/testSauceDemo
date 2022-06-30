Feature: Checkout Item

  @positive
  Scenario: Checkout item successfully
    Given user already add item to cart
    When user click on checkout button
    Then checkout: your information should be appear
    When user fill first name with "test"
    And user fill last name with "feature"
    And user fill zip postal code with "A5743"
    And user click on continue button
    Then checkout: overview page should be appear

  @positive
  Scenario: Cancel checkout
    Given user already on Checkout: Your Information page
    When user click on cancel button
#    Then return to cart page

  @positive
  Scenario: Return to cart page by cart icon
    Given user already on Checkout: Your Information page
    When user click on cart icon
#    Then return to cart page

  @negative
  Scenario: Checkout item without fill any information
    Given user already on Checkout: Your Information page
    When user click on continue button
    Then error message will appear below "Error: First Name is required"

  @negative
  Scenario: Checkout item without fill Last Name
    Given user already on Checkout: Your Information page
    When user fill first name with "test"
    And user fill zip postal code with "A5743"
    And user click on continue button
    Then error message will appear below "Error: Last Name is required"

  @negative
  Scenario: Checkout item without fill Postal Code
    Given user already on Checkout: Your Information page
    When user fill first name with "test"
    And user fill last name with "feature"
    And user click on continue button
    Then error message will appear below "Error: Postal Code is required"