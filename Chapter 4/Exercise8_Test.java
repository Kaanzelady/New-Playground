import java.util.Scanner;

public class Exercise8_Test {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        smallestLargest(console);
    }

    public static void smallestLargest(Scanner console) {
        System.out.print("How many numbers do you want to enter? ");
        int totalNumbers = console.nextInt();
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= totalNumbers; i++) {
            System.out.printf("Number %d: ", i);
            int enterNumber = console.nextInt();
            if (enterNumber < min) {
                min = enterNumber;
            }
            if (enterNumber > max) {
                max = enterNumber;
            }
        }
        System.out.println("Smallest = " + min);
        System.out.println("Largest = " + max);
    }
}
