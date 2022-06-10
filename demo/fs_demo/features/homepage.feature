Feature: Users who go onto the homepage should be able to click on the login link

    Scenario: User clicks on the login link
        Given I am on the homepage
        When I click on the login link
        Then I should be routed to the login page