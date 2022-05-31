from flask import render_template

from service.registration_service import create_login, create_user_info, validate_registration

def get_registration_page():
    return render_template("registration.html")

def register_user(register_input):
    # validate input
    input_dict = {
        "username": register_input["username"],
        "password": register_input["password"],
        "first_name": register_input["first_name"],
        "last_name": register_input["last_name"],
    }
    if validate_registration(input_dict):
        # create user
        user_id = create_login(register_input)
        info_id = create_user_info(user_id, register_input)
        if info_id is not None:
            return render_template("login.html")
    else:
        return "Failed to register"