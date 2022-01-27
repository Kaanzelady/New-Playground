import java.io.*;
import java.util.Scanner;

public class ShowSum {
    public static void main(String[] args) 
    throws FileNotFoundException {
        Scanner input = new Scanner(new File("D:/Test1/numbers.txt"));
        double sum = 0.0;

        for (int i = 1; i <= 5; i++) {
            double next = input.nextDouble();
            System.out.println("number " + i + " = " + next);
            sum += next;
        }
        System.out.println("Sum = " + sum);
    }
}
