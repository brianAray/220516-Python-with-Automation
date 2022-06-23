Feature: Is it Friday yet?
    Everybody wants to know when it's Friday!

    Scenario: Sunday is not Friday
        Given today is Sunday
        When I ask whether it's Friday
        Then I should be told "Nope"
    
    Scenario: Friday is Friday
        Given today is Friday
        When I ask whether it's Friday
        Then I should be told "TGIF"
