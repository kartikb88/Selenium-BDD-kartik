# new feature
# Tags: optional
@amazon
Feature: User Search for a product in amazon

  Scenario: User Search for a Iphone 14 in amazon
    Given User is at amazon website after launching the URL
    Then User search for the product in search result
    And User clicks on the search button