# 2players -> rock ,paper, scissors
'''Rock beats scissors
Paper beats rock
Scissors beats paper'''

#Each players name 
Player1 = input ("Enter Player_1's name: ")
Player2 = input ("Enter player_2's name: ")

#ask rock paper or scissors
Player1_Choice = input(Player1 + " what you want to choose(rock,paper,scisssor)? ").lower()
Player2_Choice = input(Player1 + " what you want to choose(rock, paper, scissor)? ").lower()

#game begins
if Player1_Choice == Player2_Choice:
    print("It's a tie !!")
if( Player1_Choice == "rock"):
    if(Player2_Choice == "paper"):
        print("Player 2 wins! Paper covers rock.")
    else:
        print("Player 1 wins! Rock crushes scissors")

if (Player1_Choice == "scissors"):
    if(Player2_Choice == " rock"):
        print("Player 1 wins ! Rock crushes scissors")
    else:
        print("Player 1 Wins Scissors cuts paper")
if (Player1_Choice == "Paper"):
    if(Player2_Choice == "scissors"):
        print(" Player 2 wins ! scissors cus paper")
    else:
        print("Player 1 wins ! Paper covers rock")
#Ask if the Player want to play again
Play_again = input("do you want to play again? (Yes/NO)").lower()
if Play_again == "yes":
    pass
else:
    print("Thanks for playing")