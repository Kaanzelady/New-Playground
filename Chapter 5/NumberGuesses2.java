import java.util.Random;
import java.util.Scanner;

public class NumberGuesses2 {
    public static void main(String[] args) {
        getIntro();
        Scanner console = new Scanner(System.in);

        // pick random number between 0 nand 99
        Random rand = new Random();
        int number = rand.nextInt(100);

        // get first guess
        int guess = getGuess(console);
        int numGuesses = 1;

        // give hints until the correct guess  is reached
        while (guess != number) {
            System.out.println("Incorrect (Hint: " + matches(number, guess) +
                             " digits match)");
            guess = getGuess(console);
            numGuesses++;
        }

        System.out.println("You got it right in " + numGuesses + "tries");
    }

    public static void getIntro() {
        System.out.println("Try to guess my two-digit number, ");
        System.out.println("and I will tel you how many");
        System.out.println("digits from your guess appear in my number.");
        System.out.println();
    }

    //return # of matching digits between two number.
    //pre: number and guess are two-digit number.
    public static int matches(int number, int guess) {
        int numMatches = 0;

        if (guess / 10 == number % 10 || guess / 10 == number /10) {
            numMatches++;
        }

        if (guess % 10 != guess / 10 && (guess % 10 == number / 10 ||
            guess % 10 == number % 10)) {
            numMatches++;
        }
        return numMatches;
    }

    // prompt until a number within range is entered
    //post: guess is between 0 and 99
    public static int getGuess(Scanner console) {
        System.out.print("You guess? ");
        int guess = getInt(console);
        while (guess < 0 || guess >= 100) {
            System.out.println("Guess number is out of range between 0 and 99");
            System.out.print("Try again: ");
            guess = getInt(console);
        }

        return guess;
    }

    // prompt until a valid number is entered.
    public static int getInt(Scanner console) {
        while (!console.hasNextInt()) {
            console.next();
            System.out.print("Not an integer. Try again: ");
        }
        return console.nextInt();
    }
}
