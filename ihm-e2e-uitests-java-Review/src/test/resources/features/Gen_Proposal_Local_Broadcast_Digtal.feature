Feature: Generate Proposal

  Scenario: Generate a local opportunity saleforce
    And the AE user is on the SF dashboard
    And create new opportunity

  Scenario: Generate and sync a local broadcast proposal
#    Given there is local opportunity
    And the user is logged as AE from UP
    And the AE user is on the UP dashboard
#    And select multi product flow
#    And fills out campaign workflow
#      | weeksToGenerate |
#      | 1               |
#    When user generates the products
#      | broadcast        |
#      | Campaign Builder |
#    And clicks review button
#    Then review page should be active

    # Returning back from Review Page to choose Media
#    When clicks to return back from review page to choose media
#    Then the user should be redirected to View Schedule

    # Sync process
#    Then the changes is saved
#    And syncs the proposal
#    Then displayed with message "Proposal saved, sync in progress..."
#    And click review button after sync

    # Send Proposal for approval
#    When click send for approval
#      And click send button
#     Then displayed with message "Proposal is being sent to approval.OK"
#     Then displayed with message "Proposal sent to approval.OK"

#  Scenario: Approval opportunity in saleforce
#    And the SM user is on the SF dashboard
#    And Approval for SM user
#
#  Scenario: Approval opportunity in saleforce
#    And the TM user is on the SF dashboard
#    And Approval for TM user

