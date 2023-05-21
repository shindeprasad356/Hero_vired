# Define the input string
string1 = "India"

# Initialize an empty set to store unique letters
unique_letters = set()

# Loop through each letter in the string
for letter in string1:
    # If the letter is not already in the set, add it
    if letter not in unique_letters:
        unique_letters.add(letter)

# Print the set of unique letters
print("uniqueLetters = ", end="")
for letter in unique_letters:
    print(letter, end="")
print()