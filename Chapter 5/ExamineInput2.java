import java.util.Scanner;

public class ExamineInput2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        getInt(console, "How old are you? ");
        console.close(); 
    }
    public static int getInt(Scanner console, String prompt) {
        System.out.print(prompt);
        while (!console.hasNextInt()) {
            console.next(); //discard the input
            System.out.println("Not an integer; try again");
            System.out.print(prompt);
        }
        return console.nextInt();
    }
}
