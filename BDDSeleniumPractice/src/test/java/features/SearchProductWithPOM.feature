@SearchProductWithPOM
Feature: Search a Product

Scenario: Search Experience

Given User is on the OpenCart Landing Page
When User Search "iPhone" in the SearchBox
Then "iPhone" product Should be Displayed
And Validate Proudct Name