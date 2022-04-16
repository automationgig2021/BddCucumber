@dummyfeature
  Feature: Add to cart
    Rule: Add from store
      Scenario: Add one quantity to a cart
        Given I'm on store page
        When I add a "Blue Shoes" to the cart
        Then I see 1 "Blue Shoes" in the cart

      Scenario Outline: Add one quantity to a cart from example
        Given I'm on store page
        When I add a "<Product_Name>" to the cart
        Then I see <Quantity> "<Product_Name>" in the cart
        Examples:
          |Product_Name  | Quantity |
          |Blue Shoes    |2         |