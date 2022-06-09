from behave import when, then
from selenium.webdriver.support.select import Select

@when(u'I enter {criteria} into the search bar')
def step_impl(context, criteria):
    context.wiki_home.search_bar().send_keys(criteria)


@when(u'I select {language} as my language option')
def step_impl(context, language):
    context.wiki_home.language_selector().select_by_value(language)


@when(u'I click the search button')
def step_impl(context):
    context.wiki_home.search_button().click()


@then(u'I should be on a page with the title {title}')
def step_impl(context, title):
    assert context.driver.title == title

