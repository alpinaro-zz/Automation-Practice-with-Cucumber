Feature: US1001 Sign Up and Order

  @ap @open
  Scenario: TC001 Open Site
    When go to "BaseURL"
    Then page source contains "Automation Practice"

  @ap @account @signin
  Scenario: TC002 Open Sign In Page
    When Sign in link clicked
    Then page is "Authentication"

  @ap @account @create
  Scenario: TC003 Create Account
    When email address entered
    And Create an account button clicked
    And form filled
    And Register button clicked
    Then page is "My account"

  @ap @shopping
  Scenario: TC004 Select Category
    When Dresses category hovered
    And Summer Dresses category clicked
    Then page title contains "Summer Dresses"

  @ap @shopping
  Scenario: TC005 Select Product
    When first product hovered
    And Add to cart link clicked
    And 5 seconds waited
    Then product added to cart
    And product name contains "Summer"
    And cart contains 1 item
    # More controls may be added

  @ap @shopping
  Scenario: TC006 Shopping Cart
    When Proceed to checkout link clicked
    Then page is "Your shopping cart"
    # More controls may be added

  @ap @shopping
  Scenario: TC007 Address Check
    When Proceed to checkout link2 clicked
    Then page is "Addresses"
    And delivery address is correct
    # More controls may be added

  @ap @shopping
  Scenario: TC008 Shipping Check
    When Proceed to checkout button clicked
    Then page is "Shipping"

  @ap @shopping
  Scenario: TC009 Payment Methods
    When Terms of service checkbox selected
    And Proceed to checkout button2 clicked
    Then page is "Your payment method"

  @ap @shopping
  Scenario: TC010 Bank-wire Method
    When Pay by bank wire link clicked
    Then page is "Bank-wire payment."

  @ap @shopping
  Scenario: TC011 Confirm
    When I confirm my order button clicked
    Then page is "Order confirmation"
    And order is complete

  @ap @account
  Scenario: TC012 Confirm
    When account link clicked
    Then page is "My account"

  @ap @account @shopping
  Scenario: TC013 Order History Check
    When order history link clicked
    Then Status is "On backorder"
    # More controls may be added

  @ap @close
  Scenario: TC014 Close
    When close browser