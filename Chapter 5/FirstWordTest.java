public class FirstWordTest {
    public static void main(String[] args) {
       String n = firstWord(" ");   
       System.out.println(n);
       System.out.println(firstWord("  l"));
    }
    public static String firstWord(String sentence) {
        String word = "";
        int n = 0;
        while (n < sentence.length() && sentence.charAt(n) == ' ') {
            n++;
        }
        if (n == sentence.length()) {
            return word;
        }
        while (sentence.charAt(n) != ' ') {
            word = word + sentence.charAt(n);
            if (n == sentence.length() - 1) {
                return word;
            }
            n++;
        }
        return word;
    }
}
