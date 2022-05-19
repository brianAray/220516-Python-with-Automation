from models.container import Shaker

def generate_test_cases():
    test_1 = [True, False, False, False]
    test_2 = [False, True, False, False]
    test_3 = [False, False, True, False]
    test_4 = [False, False, False, True]

    test_cases = [test_1, test_2, test_3, test_4]
    return test_cases

def generate_default_shakers():
    shaker_1 = Shaker("Sugar", "A")
    shaker_2 = Shaker("Sugar", "B")
    shaker_3 = Shaker("Salt", "C")
    shaker_4 = Shaker("Sugar", "D")

    shakers = [shaker_1, shaker_2, shaker_3, shaker_4]
    return shakers


def print_scenario(case_number, shakers):
    print(f"Case {case_number + 1}")
    for shaker in shakers:
        print(shaker)

def execute_scenario(case, shakers):
    if(case[0]):
        shakers[0].contents = "Salt"
    elif(case[1]):
        shakers[1].contents = "Salt"
    elif(case[2]):
        shakers[2].contents = "Sugar"
    elif(case[3]):
        shakers[1].contents = "Sugar"
    return shakers

def validate_scenario(shakers):
    counter = 0
    for shaker in shakers:
        if(shaker.contents == "Salt"):
            counter += 1

    if counter == 1:
        return True
    else:
        return False

def main():
    test_cases = generate_test_cases()

    for i in range(len(test_cases)):
        shakers = generate_default_shakers()
        updated_shaker = execute_scenario(test_cases[i], shakers)
        if(validate_scenario(updated_shaker)):
            print_scenario(i, shakers)

if __name__ == "__main__":
    main()