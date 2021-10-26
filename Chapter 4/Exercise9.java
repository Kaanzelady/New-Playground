import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        evenSumMax(console);
    }

    public static void evenSumMax(Scanner console) {
        System.out.print("How many integers? ");
        int number = console.nextInt();
        
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            System.out.print("Next integer? ");
            int temporary = console.nextInt();
            if (temporary % 2 == 0) {
                if (temporary > max) {
                    max = temporary;
                }
                sum = sum + temporary;
            }
        }
        System.out.printf("Even sum = %d, ", sum);
        System.out.println("Even max = " + max);
    }
}
