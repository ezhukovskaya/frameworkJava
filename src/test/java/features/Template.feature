Feature: Template Menu

  Background: Implements before the scenarios
    Given I have a menu item with name "Cucumber Cake" and price 20
    When I add that menu item
    Then Menu item with name "Cucumber Cake" should be added

  @SmokeTest
  Scenario: Add new menu item
    Given I have a menu item with name "Cucumber Sandwich" and price 20
    When I add that menu item
    Then Menu item with name "Cucumber Sandwich" should be added

  @RegularTest
  Scenario: Add the second menu item
    Given I have a menu item with name "Cucumber Cake" and price 20
    When I add that menu item
    Then Menu item with name "Cucumber Cake" should be added

  @NightlyBuildTest @RegularTest
  Scenario: Add the third menu item
    Given I have a menu item with name "Cucumber Sandwich" and price 20
    When I add that menu item
    Then I should see error message with "Duplicate Item"