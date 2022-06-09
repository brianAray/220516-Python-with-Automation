Feature: I can search for content in different languages using the same search bar

    Scenario Outline:
        Given I am on the Wikipedia home page
        When I enter <criteria> into the search bar
        When I select <language> as my language option
        When I click the search button
        Then I should be on a page with the title <title>

        Examples:
            | criteria      | language      | title                 |
            | Phone         | en            | Telephone - Wikipedia |
            | horse         | fr            | Horse — Wikipédia     |
            | Schnitzel     | de            | Schnitzel – Wikipedia |