class NinjaFight:

    def __init__(self, ninja_level=None):
        self.ninja_level = ninja_level
        self.opponent = None

    def decision(self):
        """
            Business logic with how a Ninja should react to their opponent
        """
        assert self.ninja_level is not None
        assert self.opponent is not None
        if self.opponent == "Samurai":
            return "Run"
        if "black-belt" in self.ninja_level:
            return "Engage"
        else:
            return "Run"