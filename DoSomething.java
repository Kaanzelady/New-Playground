import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.File;

public class DoSomething {
    public static void main(String[] args)
    throws FileNotFoundException {
        PrintStream output = new PrintStream(new File("TestC701.txt"));
        output.println("Test101java");
    }
}
