# Define the size of the diamond
size = 4

# Print the top half of the diamond
for i in range(size):
    # Print the spaces before the first asterisk
    print(" " * (size - i - 1), end="")
    
    # Print the first half of the row
    for j in range(i + 1):
        print("* ", end="")
    
    # Print the second half of the row
    for j in range(i):
        print("* ", end="")
    
    # Move to the next line
    print()

# Print the bottom half of the diamond
for i in range(size - 2, -1, -1):
    # Print the spaces before the first asterisk
    print(" " * (size - i - 1), end="")
    
    # Print the first half of the row
    for j in range(i + 1):
        print("* ", end="")
    
    # Print the second half of the row
    for j in range(i):
        print("* ", end="")
    
    # Move to the next line
    print()
