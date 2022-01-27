import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Hello4 {
    public static void main(String[] args)
    throws FileNotFoundException {
        PrintStream output = new PrintStream(new File("D:/Test1/hello.txt"));
        output.println();
        output.println();
        output.println("This produces 3 lines of output.");
    }
}
