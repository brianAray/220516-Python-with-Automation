from behave import given, when, then
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import random
import string

def get_random_string(length):
    letters = string.ascii_letters
    result_str = ''.join(random.choice(letters) for i in range(length))
    return result_str

@when(u'I click on the login page')
def step_user_clicks_on_login_button(context):
    context.homepage.login_link().click()

@when(u'I click on the registration button')
def step_impl(context):
    context.loginpage.registration_button().click()

@then(u'I should be on the registration page')
def step_impl(context):
    assert context.driver.title == "Registration"

@given(u'I am on the registration page')
def step_impl(context):
    context.driver.get("http://127.0.0.1:5000/registration")

@when(u'I input in a valid username')
def step_impl(context):
    valid_username = get_random_string(random.randint(5, 10))
    context.registrationpage.username_input().send_keys(valid_username)

@when(u'I input in a valid password')
def step_impl(context):
    valid_password = get_random_string(random.randint(5, 10))
    context.registrationpage.password_input().send_keys(valid_password)

@when(u'I input in a valid first name')
def step_impl(context):
    valid_first_name = get_random_string(random.randint(5, 10))
    context.registrationpage.first_name_input().send_keys(valid_first_name)

@when(u'I input in a valid last name')
def step_impl(context):
    valid_last_name = get_random_string(random.randint(5, 10))
    context.registrationpage.last_name_input().send_keys(valid_last_name)

@when(u'I click the submit button')
def step_impl(context):
    context.registrationpage.submit_button().click()

@then(u'I should have a success response')
def step_impl(context):
    try:
        element = WebDriverWait(context.driver, 10).until(
            EC.presence_of_element_located((By.ID, "registration_button"))
        )
    finally:
        assert context.driver.title == "Login"
