import java.io.File;

public class TestC6 {
    public static void main(String[] args) {
        File f = new File("D:\\New Playground\\Chapter 6\\Hamlet.txt");
        
        if (f.exists())
            System.out.println(f.getName());

        if (f.canRead())
            System.out.println("Can read!");
        else
            System.out.println("Cant read!");
        
        System.out.println(f.getAbsoluteFile());
        
        if (f.isDirectory())
            System.out.println("is Directory");
        else 
            System.out.println("not a Directory");

        if(f.isFile())
            System.out.println("is File");
        else
            System.out.println("not a File");

    }
}