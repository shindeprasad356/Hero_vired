# Winner of a Football Match

listPlayerA = [6, 3, 7]
listPlayerB = [2, 6, 6]

playerAScore = 0
playerBScore = 0

for i in range(len(listPlayerA)):
    if listPlayerA[i] > listPlayerB[i]:
        playerAScore += 1
    else:
        playerBScore += 1

if playerAScore > playerBScore:
    print("Winner is: Player-A")
else:
    print("Winner is: Player-B")