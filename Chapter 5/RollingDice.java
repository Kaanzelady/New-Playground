import java.util.*;

public class RollingDice {
    public static void main(String[] args) {
        Random r = new Random();
        int sum;
        do {
            // roll the dice once
            int roll1 = r.nextInt(6) + 1;
            int roll2 = r.nextInt(6) + 1;
            sum = roll1 + roll2;
            System.out.println(roll1 + " + " + roll2 + " = " + sum);
        } while (sum != 7);
    }
}