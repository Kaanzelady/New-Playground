import java.util.Random;

public class Exercise4C5 {
    public static void main(String[] args) {
        randomX();
    }

    public static void randomX() {
        Random rand = new Random();
        int num;

        do {
            num = rand.nextInt(16) + 5;
            for (int i = 1; i <= num; i++) {
                System.out.print("x");
            }
            System.out.println();
        } while (num != 16);
    }
}
