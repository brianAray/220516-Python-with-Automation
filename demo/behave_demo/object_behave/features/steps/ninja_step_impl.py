from behave import given, when, then
from models.ninja_fight import NinjaFight

@given(u'the ninja has a third level black-belt')
def step_ninja_has_black_belt(context):
    context.ninja = NinjaFight("black-belt")

@when(u'attacked by a "{opponent}"')
def step_ninja_has_an_opponent(context, opponent):
    context.ninja.opponent = opponent

@then(u'the ninja should "{reaction}"')
def step_ninja_should_react_correctly(context, reaction):
    assert context.ninja.decision() == reaction
