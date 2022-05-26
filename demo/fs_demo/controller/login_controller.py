from flask import render_template
from service.login_service import check_login
def get_login_page():
    return render_template("login.html")

def check_user_login(login_input):
    user_login = check_login(login_input)

    if user_login is None:
        return "Failed login"
    else:
        return render_template("account_page.html", username=user_login.username)