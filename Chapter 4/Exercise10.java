import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        printGPA(console);
    }

    public static void printGPA(Scanner console) {
        System.out.print("Enter a student record: ");

        String name = console.nextLine();
        int num = console.nextInt();
        double sum = 0.0;
        double average = 0.0;
        
        for (int i = 1; i <= num; i++) {
            int score = console.nextInt();
            sum += score;
        }
        average = sum / num;
        System.out.printf("%s's grade is %.2f\n", name, average);
    }
}
