@ReRunFailedScenarios
Feature: Rerun Failed Scenario Example

Scenario Outline: Try to Rerun the Failed Scenarios

Given User is on the Login page
When User eneters the <UserName> and <Password> credentials
And Click the Login Button
Then My Account Page Should be Displayed
And Close the Browser

Examples:
| UserName | Password |
| freelancer@gmail.com | freelancer |
| testuser@gmail.com | testuser |