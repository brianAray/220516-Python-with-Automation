class Login:
    def __init__(self, user_id, username, password):
        self.user_id = user_id
        self.username = username
        self.password = password

    def __repr__(self) -> str:
        return f"User Login : id - {self.user_id} username - {self.username} password - {self.password}"

    def validate_login(self) -> bool:
        if len(self.username) < 5 or len(self.password) < 5:
            return False
        elif len(self.username) > 20 or len(self.password) > 20:
            return False
        else:
            return True