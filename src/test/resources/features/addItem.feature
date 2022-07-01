Feature: add item in saucedemo

  @add-item
  Scenario: Add item to cart successfully
    Given user already login
    When user click add to cart button on item
    Then number of item will appear in cart button
    When user click cart button
    Then item has added in cart page


