Feature: Users who read in different languages should be able to browse wikipedia in their own language

    Scenario Outline: 
        Given I am on the Wikipedia home page
        When I click on the "<language>" link
        Then I should see the "<title>" 

    Examples:
        | language      | title                             |
        | English       | Wikipedia, the free encyclopedia  |
        | French        | Wikipédia, l'encyclopédie libre   |

