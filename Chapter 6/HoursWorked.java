import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class HoursWorked {
    public static void main(String[] args)
    throws FileNotFoundException {
        Scanner input = new Scanner(new File("D:/Test1/hours.txt"));
        while (input.hasNextLine()) {
            String text = input.nextLine();
            process(text);
        }
    }
    public static void process(String text) {
        Scanner input = new Scanner(text);
        
        int id = input.nextInt();
        String name = input.next();
        double sum = 0.0;
        while (input.hasNextDouble()) {
            sum += input.nextDouble();
        }
        System.out.println("Total hours worked by " + name
            + "(id#" + id + ") = " + sum);
        
        input.close();
    }
}
