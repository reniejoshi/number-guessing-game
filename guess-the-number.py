import random
import time

def getRandomNumber(min, max):
    rndNum = random.randrange(min, max)
    return rndNum

def playGame():
    print('Guess the Integer\n') #Title
    time.sleep(0.5)
    print('Let\'s set the range.')
    time.sleep(0.5)
    min = int(input('Minimum: '))
    max = int(input('Maximum: '))
    if max <= min:
        print('\nSorry, the maximum must be greater than the minimum. Please try again.')
        main()
    else:
        rndNum = getRandomNumber(min, max)
    
    for guessCounter in range(100):
        print('\nAttempt #' + str(guessCounter + 1))
        time.sleep(0.3)
        userGuess = int(input('Guess the number: '))
        time.sleep(0.5)
        
        if userGuess == rndNum:
            print('Great work! You guessed the number!')
            break
        else:
            print("Not quite, please try again.")
            time.sleep(0.75)
            if userGuess < rndNum:
                print("Hint: "+ str(userGuess) + " is less than the number.")
                time.sleep(1)
            elif userGuess > rndNum:
                print("Hint: "+ str(userGuess) + " is greater than the number.")
                time.sleep(1)
    
    if userGuess != rndNum:
        print("Sorry, you only have " + str(guessCounter + 1) + " tries")

playGame()
