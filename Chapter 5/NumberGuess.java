import java.util.*;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        numGuess(console);
    }
    public static void numGuess(Scanner console) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        System.out.print("Guess the number: ");
        int guess = console.nextInt();
        int guessCount = 1;

        while (guess != number) {
            int numMatches = matches(number, guess);
            System.out.println("Incorrect (Hint: " +
                                numMatches + " digits match)");
            System.out.print("Guess again: ");
            guess = console.nextInt();
            guessCount++;
        }
        System.out.println("You got it right in " + guessCount + "tries");
    }
    public static int matches(int number, int guess) {
        int numMatches = 0;

        if (guess / 10 == number / 10 || guess / 10 == number % 10) {
            numMatches++;
        }

        if (guess % 10 != guess / 10 && (guess % 10 == number / 10 ||
            guess % 10 == number % 10)) {
            numMatches++;
        }
        
        return numMatches;
    }
}
