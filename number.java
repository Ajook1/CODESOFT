import java.util.Random;
import java.util.Scanner;

public class Numberguess {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        int min = 1;
        int max = 100;
        int maxAttempts = 10;
        
        System.out.println("THE NUMBER GUESSING GAME......");
        System.out.println("Guess the number between " + min + " and " + max + ".");
        System.out.println("You have " + maxAttempts + " attempts per round.");
        
        boolean playAgain = true;
        
        while (playAgain) {
            int targetNumber = randomGenerator.nextInt(max - min + 1) + min;
            int attempts = 0;
            boolean guessedCorrectly = false;
            
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess number : ");
                int guess = inputScanner.nextInt();
                attempts++;
                
                if (guess == targetNumber) {
                    guessedCorrectly = true;
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }
            
            if (guessedCorrectly) {
                System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + attempts + " attempts.");
            } else {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + targetNumber + ".");
            }
            
            System.out.print("Play again? [yes/no]: ");
            String playAgainResponse = inputScanner.next();
            playAgain = playAgainResponse.equalsIgnoreCase("yes");
        }
        
        System.out.println("Thank you for playing the game ");
    }
}
