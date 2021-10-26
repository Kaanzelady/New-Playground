import java.util.Scanner;

public class Exercise1_Test {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        fractionSum(console);
        console.close();
    }
    
    public static void fractionSum(Scanner console) {
        System.out.print("How many numbers sequence has? ");
        int n = console.nextInt();

        if (n <= 0) {
            throw new IllegalArgumentException("negative n: " + n);
        }

        double sum = 0.0;
        System.out.printf("The sum of the first %d terms of the sequence is:\n", n);
        for (int i = 1; i <= n; i++) {
            System.out.printf("1/%d ", i);
            sum = sum + (1.0 / i);
            if (i < n) {
                System.out.print("+ ");
            }
        }
        System.out.print("= " + sum);       
    }
    
}