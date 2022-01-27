import java.util.*;

public class Exercise7C5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        diceSum(console);
    }
    public static void diceSum(Scanner console) {
        Random rand = new Random();
        System.out.print("Desired dice sum: ");
        int desiredSum = getSum(console);
        int sum;

        do {
            int dice1 = rand.nextInt(6) + 1;
            int dice2 = rand.nextInt(6) + 1;
            sum  = dice1 + dice2;
            System.out.println(dice1 + " and " + dice2 + " = " + sum);
        } while (sum != desiredSum);
    }

    public static int getSum(Scanner console) {
        int sum = getInt(console);
        while (sum < 2 || sum > 12) {
            System.out.println("Sum is out of range. Try again: ");
            sum = getInt(console);
        }
        return sum;
    }

    public static int getInt(Scanner console) {
        while (!console.hasNextInt()) {
            console.next();
            System.out.print("Not an integer. Try again: ");
        }
        return console.nextInt();
    }
}
