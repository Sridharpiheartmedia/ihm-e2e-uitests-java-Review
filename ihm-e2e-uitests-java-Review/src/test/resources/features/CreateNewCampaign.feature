Feature: Creating a New Campaign for the Multiple Product

  I want to create broadcast and Streaming proposal

  Scenario: Create local broadcast and Streaming proposal
    Given Open Ad+Plan Dashboard
    When the user is logged as AE from UP
     And the AE user is on the UP dashboard
     And select multi product flow
     And fills out campaign workflow
      | weeksToGenerate |
      | 1               |
    When users select the products
      | broadcast        |
      | Campaign Builder |
    And fills out build targets
      |endAge|dayParts         |percentageDayPart |spotLengthSeconds|spotLengthPercentage|budget|
      |64    |6am - 10am (AMD) |100               |15 seconds       |100                 |25000 |
    When generate schedule
     And go to review page
     And save the proposal
     And sync the proposal



