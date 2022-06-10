from behave import given, when, then

@given(u'I am on the homepage')
def step_user_is_on_homepage(context):
    context.driver.get("http://127.0.0.1:5000/")


@when(u'I click on the login link')
def step_user_clicks_on_login_link(context):
    context.homepage.login_link().click()


@then(u'I should be routed to the login page')
def step_user_is_routed_to_login_page(context):
    assert context.driver.title == "Login"
