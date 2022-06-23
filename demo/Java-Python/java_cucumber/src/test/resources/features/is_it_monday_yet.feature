Feature: Is it Monday yet?
    Everybody wants to know when it's Monday!

    Scenario Outline: Today is or is not Monday
        Given today is "<day>"
        When I ask whether it's Monday yet
        Then I should be told "<answer>"

    Examples:
        | day     | answer    |
        | Friday    | Nope      |
        | Sunday    | Nope      |
        | Monday    | TGIM      |
        | Anything Else!    | Nope      |
        