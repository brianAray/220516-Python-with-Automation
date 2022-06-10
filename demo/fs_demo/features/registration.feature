Feature: As a new user to the page, I should be able to create a new account

    Scenario: I navigate from the homepage to the registration page
        Given I am on the homepage
        When I click on the login page
        When I click on the registration button
        Then I should be on the registration page

    Scenario: From the registration page I create a new account with valid inputs
        Given I am on the registration page
        When I input in a valid username
        When I input in a valid password
        When I input in a valid first name
        When I input in a valid last name
        When I click the submit button
        Then I should have a success response
