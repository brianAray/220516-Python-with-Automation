from models.container import Shaker
from shakers import execute_scenario, generate_default_shakers, generate_test_cases, validate_scenario
import pytest

test_cases = generate_test_cases()
shakers = generate_default_shakers()

def test_valid_cases_created():
    for case in test_cases:
        for item in case:
            assert isinstance(item, bool)

def test_valid_generated_shakers():
    for shaker in shakers:
        assert isinstance(shaker, Shaker)

def test_execute_first_case_scenario():
    updated_shaker = execute_scenario(test_cases[0], shakers)
    assert updated_shaker[0].contents == "Salt"

def test_execute_second_case_scenario():
    updated_shaker = execute_scenario(test_cases[1], shakers)
    assert updated_shaker[1].contents == "Salt"

@pytest.mark.parametrize("test_case, expected",[
    (test_cases[0], ("Salt", 0)),
    (test_cases[1], ("Salt", 1)),
    (test_cases[2], ("Sugar", 2)),
    (test_cases[3], ("Sugar", 1))
])
def test_multiple_executions(test_case, expected):
    updated_shakers = execute_scenario(test_case, shakers)
    assert updated_shakers[expected[1]].contents == expected[0]

def test_valid_scenario():
    mock_shaker_1 = Shaker("Sugar", "mock_1")
    mock_shaker_2 = Shaker("Salt", "mock_2")
    shakers = [mock_shaker_1, mock_shaker_2]
    assert validate_scenario(shakers)

def test_invalid_scenario():
    mock_shaker_1 = Shaker("Sugar", "mock_1")
    mock_shaker_2 = Shaker("Sugar", "mock_2")
    shakers = [mock_shaker_1, mock_shaker_2]
    assert not validate_scenario(shakers)


