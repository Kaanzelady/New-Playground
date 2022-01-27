import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CountWord {
    public static void main(String[] args)
        throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        Scanner input = getInput(console);

        int count = 0;
        String word = "";
        while (input.hasNext()) {
            word = input.next();
            count++;
        }
        System.out.println("total words = " + count);
        System.out.println("Last word = " + word);
    }

    public static Scanner getInput(Scanner console)
    throws FileNotFoundException {
        System.out.print("input file name?");
        File f = new File(console.nextLine());
        while (!f.exists()) {
            System.out.print("File not found. Try again: ");
            f = new File(console.nextLine());
        }
        return new Scanner(f);
    }
}
