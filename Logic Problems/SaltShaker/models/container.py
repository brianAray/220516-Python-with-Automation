class Shaker:

    def __init__(self, contents, name):
        self.contents = contents
        self.name = name

    def __repr__(self):
        return f"Shaker {self.name}: contents - {self.contents}"