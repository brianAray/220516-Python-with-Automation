from service.validation_service import *
from models.login_dto import Login
import pytest

import random
import string

def generate_dto():
    letters = string.ascii_letters
    username = ''.join(random.choice(letters) for i in range(random.randrange(1, 20)))
    password = ''.join(random.choice(letters) for i in range(random.randrange(1, 20)))

    random_login = Login(username, password)
    return random_login

def update_login_dto(dto):
    letters = string.ascii_letters
    username = ''.join(random.choice(letters) for i in range(random.randrange(1, 20)))
    password = ''.join(random.choice(letters) for i in range(random.randrange(1, 20)))
    dto.username = username
    dto.password = password
    return dto


@pytest.mark.parametrize("test_name, expected", (
    ("A", False), (" ", False), (".....", False), ("Brian", True), ("Tom", True),
    ("alskdjfhaklsdhfasklhdflkashdf", False),
    ("                      asdflkjasldfkj", False),
    ("235235", False), ("asdf asdfa", False)
))
def test_validate_first_name(test_name, expected):
    assert validate_first_name(test_name) == expected

@pytest.mark.parametrize("test_name, expected", (
    ("A", False), (" ", False), (".....", False), ("Brian", True), ("Tom", True),
    ("alskdjfhaklsdhfasklhdflkashdf", False),
    ("                      asdflkjasldfkj", False),
    ("235235", False), ("asdf asdfa", False)
))
def test_validate_last_name(test_name, expected):
    assert validate_last_name(test_name) == expected