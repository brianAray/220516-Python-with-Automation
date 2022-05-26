from models.login_dto import Login
from repository.login_dao import select_user

def check_login(login_input):
    print(login_input)
    user_dto = select_user(login_input.get("username"), login_input.get("password"))
    if user_dto is not None:
        return user_dto