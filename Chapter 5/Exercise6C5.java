import java.util.*;

public class Exercise6C5 {
    public static void main(String[] args) {
        makeGuesses();
    }
    public static void makeGuesses() {
        Scanner console = new Scanner(System.in);
        int guess;
        int count = 0;

        do {
            System.out.print("guess = ");
            guess = getGuess(console);
            count++;
        } while (guess < 48);

        System.out.println("total guess = " + count);
    }

    public static int getGuess(Scanner console) {
        int guess = getInt(console);
        while (guess < 1 ||guess > 50) {
            System.out.print("Number is out of range. Try again: ");
            guess = getInt(console);
        }
        return guess;
    }

    public static int getInt(Scanner console) {
        while (!console.hasNextInt()) {
            console.next();
            System.out.print("Not an integer. Try again: ");
        }
        return console.nextInt();
    }
}
