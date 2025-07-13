import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("~ Number Guessing Game ~");
        System.out.println("Please set the range.\nEnter minimum:");
        int min = scanner.nextInt();
        System.out.println("Enter maximum:");
        int max = scanner.nextInt();
    
        int randomNum = min + (int)(Math.random() * (max - min + 1));

        int maxGuesses = 10;
        int userNum;
        boolean userWin = false;
        for (int i = 0; i < maxGuesses; i++) {
            System.out.println("\nAttempt #" + (i + 1) + "\nGuess the number:");
            userNum = scanner.nextInt();

            if (userNum == randomNum) {
                userWin = true;
                break;
            }
            else if (userNum < min) {
                System.out.println("Hint: " + userNum + " is lower than the range!");
            }
            else if (userNum > max) {
                System.out.println("Hint: " + userNum + " is higher than the range!");
            }
            else if (userNum < randomNum) {
                System.out.println("Hint: " + userNum + " is too low!");
            }
            else if (userNum > randomNum) {
                System.out.println("Hint: " + userNum + " is too high!");
            }
        }

        if (userWin == true) {
            System.out.println("\nCorrect!");
        }
        else {
            System.out.println("\nThe number was " + randomNum + ".\nBetter luck next time :D");
        }
    }
}