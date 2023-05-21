# 3) Convert Integers in a list to string using map().

integers = [1, 2, 3, 4, 5]

strings = list(map(lambda i: str(i), integers))

print("Integers:", integers)
print("Strings:", strings)