class IceCreamer(object):
    TRANSFORMATION_MAP = {
        "Mango": "Mango Ice Cream",
        "Strawberry": "Strawberry Ice Cream",
        "Vanilla": "Vanilla Ice Cream",
        "Chocolate": "Chocolate Ice Cream"
    }

    def __init__(self):
        self.thing = None
        self.result = None

    @classmethod
    def select_result_for(cls, thing):
        return cls.TRANSFORMATION_MAP.get(thing, "DIRT")

    def add(self, thing):
        self.thing = thing

    def turn_on(self):
        self.result = self.select_result_for(self.thing)