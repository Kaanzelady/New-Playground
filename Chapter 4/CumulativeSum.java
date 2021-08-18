import java.util.*;

public class CumulativeSum {
    public static void main(String[] args) {
        System.out.println("This program multiplies a sequence of numbers.");
        
        Scanner console = new Scanner(System.in);
        
        System.out.println("How many numbers do you have?");
        int totalNumber = console.nextInt();

        double product = 1;
        for (int i = 1; i <= totalNumber; i++) {
            System.out.print("  #" + i +"?  ");
            double next = console.nextDouble();
            product = product * next;
        }
        System.out.println();
        System.out.println("volume = " + product);
    }
    
}
