Feature: The Game Stop

  I want to search gamestop page in google

  @Ignore
  Scenario: Opening a social network page
    Given I open Google page
    And I see "Google" in the title
    And I search "GameStop"
    Then I enter search
