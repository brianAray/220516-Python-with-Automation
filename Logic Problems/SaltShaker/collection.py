# Pass the Salt, Please
# There are 4 salt shakers
# 3 are replaced with sugar
# 1 is still salt

# Messages
# A - This is salt
# B - This is salt
# C - This is Sugar
# D - The salt is not in B

# Salt = True
# Sugar = False

# Only one of these statements are true
# If only one is true, that means the others are false therefore opposite

A = True
B = True
C = False
D = False

test_1 = [True, False, False, False]
test_2 = [False, True, False, False]
test_3 = [False, False, True, False]
test_4 = [False, False, False, True]

test_cases = [test_1, test_2, test_3, test_4]

for i in range(4):
    salts = [False, False, True, False]
    if(test_cases[i][0]):
        print("Test case A")
        salts[0] = A
    elif(test_cases[i][1]):
        print("Test case B")
        salts[1] = B
    elif(test_cases[i][2]):
        print("Test case C")
        salts[2] = C
    elif(test_cases[i][3]):
        print("Test case D")
        salts[1] = D

    for i in range(len(salts)):
        print(f"Salt {i} - {salts[i]}")