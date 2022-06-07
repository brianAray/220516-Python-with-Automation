from behave import given, when, then
from models.ice_creamer import IceCreamer

@given(u'I put "{thing}" in an Ice Creamer')
def step_impl(context, thing):
    context.creamer = IceCreamer()
    context.creamer.add(thing)

@when(u'I switch on the Ice Creamer')
def step_impl(context):
    context.creamer.turn_on()


@then(u'it should transform into "{other_thing}"')
def step_impl(context, other_thing):
    assert context.creamer.result == other_thing

