
# In order to register to my service, they need:
# Valid Username and password
# Valid first_name and Last_name
# In this case, my only validation is checking the length of each input

from models.login_dto import Login
from models.user_info_dto import User
from repository.login_dao import insert_user, select_user_by_id
from repository.user_info_dao import insert_user_info

def validate_registration(input):
    login_dto = Login(0, input.get("username"), input.get("password"))
    info_dto = User(0, 0, input.get("first_name"), input.get("last_name"))

    return login_dto.validate_login() and info_dto.validate_user_info()

def create_login(input):
    user_id = insert_user(input.get("username"), input.get("password"))

    if user_id is not None:
        return user_id

def create_user_info(user_id, input):
    login_dto = select_user_by_id(user_id)
    info_id = insert_user_info(login_dto, input.get("first_name"), input.get("last_name"))

    if info_id is not None:
        return info_id