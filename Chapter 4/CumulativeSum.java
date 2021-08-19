import java.util.*;

public class CumulativeSum {
    public static void main(String[] args) {
        System.out.println("This program adds a sequence of numbers.");
        
        Scanner console = new Scanner(System.in);
        
        System.out.println("How many numbers do you have?");
        int totalNumber = console.nextInt();

        int negatives = 0;
        double sum = 0.0;
        for (int i = 1; i <= totalNumber; i++) {
            System.out.print("  #" + i +"?  ");
            double next = console.nextDouble();
            if (next < 0) {
                negatives++;
            }
            sum += next;
        }
        System.out.println();
        System.out.println("sum = " + sum);

        if (totalNumber <= 0) {
            System.out.println("There is no number to average");
        } else {
            double average = sum / totalNumber;
            System.out.println("average = " + average);
        }
        System.out.println("# of negatives = " + negatives);

        console.close();
        System.out.println("console closed!");
    }
    
}
