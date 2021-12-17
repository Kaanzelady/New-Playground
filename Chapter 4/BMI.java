import java.util.*;

public class BMI {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        getBMI(console);
        console.close();
    }

    // Enter how many people to measure BMI and that people's information
    public static void getBMI(Scanner console) {
        System.out.println("How many people?");
        int people = console.nextInt();
        for (int i = 1; i <= people; i++) {
            System.out.printf("Enter #%d person's information:\n", i);
            System.out.print("height (in inches)? ");
            double height = console.nextDouble();
            System.out.print("weight (in pounds)? ");
            double weight = console.nextDouble();

            double bmi = BMIFor(weight, height);
            System.out.println();
            System.out.printf("Person #%d body mass index = %5.2f\n", i, bmi);
            
            reportHealthStatus(bmi);
            System.out.println();
        }
    }

    // Compute BMI and return the BMI
    public static double BMIFor(double weight, double height) {
        double bmi = weight / (height * height) * 703;
        return bmi;
    }

    // Report person's health status after measured
    public static void reportHealthStatus(double bmi) {
        if (bmi < 18.5) {
            System.out.println("underweight");
        } else if (bmi < 25) {
            System.out.println("normal");
        } else if (bmi < 30) {
            System.out.println("overweight");
        } else {  // bmi >= 30
            System.out.println("obese");
        }
    }

}
