import random

# Define the list of six-letter words
words = ["energy", "monkey", "planet", "camera", "dancer", "coffee", "guitar", "pencil", "summer", "tongue"]

# Choose a random word from the list
secret_word = random.choice(words)

# Initialize the list of guessed letters
guessed_letters = [""] * len(secret_word)

# Initialize the list of vowels in the secret word
vowels = ["a", "e", "i", "o", "u"]
vowel_positions = []

# Loop through each letter in the secret word
for i, letter in enumerate(secret_word):
    # If the letter is a vowel, add it to the list of vowel positions
    if letter in vowels:
        vowel_positions.append(i)
        guessed_letters[i] = letter

# Print the pattern of the secret word with vowels and blanks
for letter in guessed_letters:
    if letter == "":
        print("_", end=" ")
    else:
        print(letter, end=" ")
print()

# Loop through 5 rounds of guessing
for round in range(5):
    # Get a guess from the user
    guess = input("Guess a consonant: ")

    # Check if the guess is in the secret word
    if guess in secret_word:
        # Loop through each letter in the secret word
        for i, letter in enumerate(secret_word):
            # If the letter matches the guess and is not a vowel, add it to the guessed letters
            if letter == guess and i not in vowel_positions:
                guessed_letters[i] = letter

        # Print the updated pattern of the secret word with vowels and guessed letters
        for letter in guessed_letters:
            if letter == "":
                print("_", end=" ")
            else:
                print(letter, end=" ")
        print()

        # Check if the guessed letters match the secret word
        if "".join(guessed_letters) == secret_word:
            print("The word is", secret_word)
            print("Won the Round..!")
            break
    else:
        print("Incorrect guess.")
else:
    print("Out of guesses. The word was", secret_word)