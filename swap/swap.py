# Temporary variable swap
a = 5
b = 10
print("Using temporary variable swap:")
print(f"Before swap: a = {a}, b = {b}")
a, b = b, a
print(f"After  swap: a = {a}, b = {b}")
print("========================")

# XOR swap
x, y = 15, 25
print("Using XOR swap:")
print(f"Before XOR swap: x = {x}, y = {y}")
x = x ^ y
y = x ^ y
x = x ^ y
print(f"After  XOR swap: x = {x}, y = {y}")
print("========================")

# Addition/subtraction swap
m, n = 30, 45
print("Using addition and subtraction swap:")
print(f"Before add/sub swap: m = {m}, n = {n}")
n = m - n
m = m - n
n = n + m
print(f"After  add/sub swap: m = {m}, n = {n}")
print("========================")

