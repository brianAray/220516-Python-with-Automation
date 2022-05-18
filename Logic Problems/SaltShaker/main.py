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

salt_1 = False
salt_2 = False 
salt_3 = True
salt_4 = False

A = True
B = True
C = False
D = False

# Test case 1: A is Active
salt_1 = False
salt_2 = False 
salt_3 = True
salt_4 = False

salt_1 = A

print(f"Salt 1 - {salt_1}\nSalt 2 - {salt_2}\nSalt 3 - {salt_3}\nSalt 4 - {salt_4}\n")

# Test case 2: B is Active
salt_1 = False
salt_2 = False 
salt_3 = True
salt_4 = False

salt_2 = B
print(f"Salt 1 - {salt_1}\nSalt 2 - {salt_2}\nSalt 3 - {salt_3}\nSalt 4 - {salt_4}\n")

# Test case 3: C is Active
salt_1 = False
salt_2 = False 
salt_3 = True
salt_4 = False

salt_3 = C
print(f"Salt 1 - {salt_1}\nSalt 2 - {salt_2}\nSalt 3 - {salt_3}\nSalt 4 - {salt_4}\n")

# Test case 4: D is Active
salt_1 = False
salt_2 = False 
salt_3 = True
salt_4 = False

salt_2 = D
print(f"Salt 1 - {salt_1}\nSalt 2 - {salt_2}\nSalt 3 - {salt_3}\nSalt 4 - {salt_4}\n")