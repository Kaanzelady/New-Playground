import java.util.*;

public class BooleanTest {
    public static void main(String[] args) {
        boolean test1 = true;
        boolean test2 = false;
        test1 = test2;
        System.out.print(test1);
        System.out.println();

        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        boolean positive = (number > 0);
        if (positive) {
        System.out.println("positive");
        } else {
            System.out.println("not positive");
        }
        console.close();
    }  
}
