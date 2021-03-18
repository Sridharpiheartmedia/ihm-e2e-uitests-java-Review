# new feature
# Tags: optional

Feature: Create Opportunity

  I want to create a new opportunity

  Scenario: creating an opportunity for the existing account
    Given Open Salesforce Dashboard
    Then the user is logged as AE from SF
   # And navigate to the account
    Then create a new opportunity in 7 days
    And create a opportunity initiative


