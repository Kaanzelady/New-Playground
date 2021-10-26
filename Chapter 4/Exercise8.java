import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        smallestLargest(console);
    }

    public static void smallestLargest(Scanner console) {
        System.out.print("How many numbers do you want to enter? ");
        int totalNumbers = console.nextInt();
        
        System.out.print("Number 1: ");
        int firstNumber = console.nextInt();
        int min = firstNumber;
        int max = firstNumber;

        for (int i = 2; i <= totalNumbers; i++) {
            System.out.printf("Number %d: ", i);
            int enterNumber = console.nextInt();
            if (enterNumber < min) {
                min = enterNumber;
            } else if (enterNumber > max) {
                max = enterNumber;
            }
        }
        System.out.println("Smallest = " + min);
        System.out.println("Largest = " + max);
    }
}
