import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1; // Minimum number in the range
        int maxRange = 100; // Maximum number in the range
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;

        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange);

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int playerGuess = scanner.nextInt();
            attempts++;

            if (playerGuess == randomNumber) {
                System.out.println(
                        "Congratulations! You guessed the number " + randomNumber + " in " + attempts + " attempts.");
                hasGuessedCorrectly = true;
            } else if (playerGuess < randomNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }

        scanner.close();
    }

    @Override
    public String toString() {
        return "GuessTheNumber []";
    }
}