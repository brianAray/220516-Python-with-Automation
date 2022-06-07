Feature: Scenario Outline for Ice Creamer

    This scenario will putting ingredients inside an Ice Creamer object

    Scenario Outline: Use Ice Creamer with <thing>
        Given I put "<thing>" in an Ice Creamer
        When I switch on the Ice Creamer
        Then it should transform into "<other thing>"

        Examples: Fruit
            | thing         | other thing           |
            | Mango         | Mango Ice Cream       |
            | Strawberry    | Strawberry Ice Cream  |

        Examples: Basic Ingredients
            | thing     | other thing               |
            | Vanilla   | Vanilla Ice Cream         |
            | Chocolate | Chocolate Ice Cream       |

        Examples: Incorrect Input
            | thing     | other thing               |
            | Cherry    | DIRT          |

        