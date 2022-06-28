Feature: Supplier Search Feature

    As a user, I can search for a supplier and see all the items that they sell

Background: 
    Given a user is on the supplier page

    Scenario: A user searches for a supplier using their id 
        When a user enters a valid supplier id
        And clicks on the search button
        Then the user can see the suppliers listed items
