Feature: Performing Revision for Closed Opportunity

  Review the Opportunity

  Scenario: Perform Review for Closed Opportunity
    Given Launch AdPlus URL
    When  Login in to the application
    Then  Click on Down button beside Clone and Launch Revision
    And   Click on Revise Order in Ad+Orders page
    And   Click Yes on the Popup
    And   Click BroadCast Section for Revision
    Then  Click First Station and Add Two Weeks After
    And   Save Changes by clicking Save Only
    Then  Return to AddPlusOrders and Submit for Approval