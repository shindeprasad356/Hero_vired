import random

def printBoard(playerA, playerB):
    board = [
        ["01", "02", "03", "A", "05"],
        ["10", "09", "08", "07", "06"],
        ["11", "12", "13", "14", "15"],
        ["20", "19", "18", "17", "16"],
        ["21", "22", "23", "24", "25"],
        ["30", "29", "28", "27", "26"]
    ]

    board[playerA // 5][playerA % 5] = "A"
    board[playerB // 5][playerB % 5] = "B"

    print("--------------------------")
    for row in board:
        print("|".join(row))
        print("--------------------------")

def rollDice():
    return random.randint(1, 6)

def playGame():
    playerA, playerB = 0, 0

    while playerA < 30 and playerB < 30:
        input(f"Press 'Y' to roll dice for Player: A - ")
        diceRoll = rollDice()
        playerA += diceRoll
        if playerA > 30:
            playerA = 30

        if playerA == playerB:
            playerB = 0

        printBoard(playerA, playerB)
        print(f"Player A: {playerA} | Player B: {playerB}")
        print("--------------------------")

        if playerA == 30:
            print("Player A wins!")
            break

        if diceRoll == 6:
            input(f"Press 'Y' to roll dice for Player: A - ")
            diceRoll = rollDice()
            playerA += diceRoll
            if playerA > 30:
                playerA = 30

            if playerA == playerB:
                playerB = 0

            printBoard(playerA, playerB)
            print(f"Player A: {playerA} | Player B: {playerB}")
            print("--------------------------")

            if playerA == 30:
                print("Player A wins!")
                break

        input(f"Press 'Y' to roll dice for Player: B - ")
        diceRoll = rollDice()
        playerB += diceRoll
        if playerB > 30: