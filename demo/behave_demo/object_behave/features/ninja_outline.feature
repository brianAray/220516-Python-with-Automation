Feature: Ninja Fight or Flight

    Testing Ninja survival rate, a ninja should be able to choose
    the correct opponent based on their own skill

    Scenario Outline: Ninja Opponents
        Given the ninja has a third level black-belt
        When attacked by a "<opponent>"
        Then the ninja should "<reaction>"

        Examples:
            | opponent  | reaction  |
            | Bandit    | Engage    |
            | Samurai   | Run       |
            | Ninja     | Engage    |
            | Tiger     | Engage    |