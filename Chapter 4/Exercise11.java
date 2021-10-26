import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        longestName(console, 4);
    }

    public static void longestName(Scanner console, int num) {
        int max = Integer.MIN_VALUE;
        String longestName = "";

        for (int i = 1; i <= num; i++) {
            System.out.print("name #" + i + "? ");
            String name  = console.nextLine();

            if (name.length() > max) {
                max = name.length();
                longestName = name;        
            }
        }
        System.out.printf("%s's name is longest", longestName);
    }
}
