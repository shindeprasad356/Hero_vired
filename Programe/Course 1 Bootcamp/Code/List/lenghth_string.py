# 2) Find lengths of strings in a list using map().

strings = ["hello", "world", "how", "are", "you", "doing", "today"]

string_lengths = list(map(lambda s: len(s), strings))

print("Strings:", strings)
print("String lengths:", string_lengths)
