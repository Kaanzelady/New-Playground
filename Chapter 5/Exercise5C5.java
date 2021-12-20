import java.util.Random;

public class Exercise5C5 {
    public static void main(String[] args) {
        randomLines();
    }
    public static void randomLines() {
        Random rand = new Random();
        String letters = "abcdefghijklmnopqrstuvwxyz";
        int numLines = 5 + rand.nextInt(6);

        for (int i = 1; i <= numLines; i++) {
            int lineLength = rand.nextInt(80) + 1;
            
            for (int j = 1; j <= lineLength; j++) {
                int k = rand.nextInt(26);
                char ch = letters.charAt(k);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
