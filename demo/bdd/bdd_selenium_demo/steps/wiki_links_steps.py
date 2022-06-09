from behave import given, when, then

@given(u'I am on the Wikipedia home page')
def step_impl(context):
    context.driver.get("https://www.wikipedia.org/")

@when(u'I click on the "{language}" link')
def step_impl(context, language):
    if language == "English":
        context.wiki_home.english().click()
    elif language == "French":
        context.wiki_home.french().click()

@then(u'I should see the "{title}"')
def step_impl(context, title):
    assert context.driver.title == title
