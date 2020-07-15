Feature: Final Bill Example

  @ScenarioOutlineExample
  Scenario Outline: Customer Bill Amount Calculation
    Given I have a Customer
    And user enters initial bill amount as <billAmount>
    And Sales Tax Rate is <taxRate> percent
    Then Final bill amount calculate is <calculatedBillAmount>
    Examples:
    |billAmount|taxRate|calculatedBillAmount|
    |100       |10     |110                 |
    |200       |8      |216                 |
    |100       |1.55   |101.55              |
