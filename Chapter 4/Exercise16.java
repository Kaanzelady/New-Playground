import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        printPalindrome(console);
        console.close();
    }
    public static void printPalindrome(Scanner console) {
        String word = console.nextLine();
        String word2 = "";
        for (int i = 0; i < word.length(); i++) {
            word2 = word.charAt(i) + word2;
        }
        if (word.equalsIgnoreCase(word2)) {
            System.out.println("this word is a palindrome!");
        } else {
        System.out.println("This word is not a palindrome");
        }
    }
}
