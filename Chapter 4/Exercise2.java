public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(repl("hello ", 0));
    }

    public static String repl(String sentence, int number) {
        String words = sentence;

        if (number <= 0) {
            return "";
        }
        
        for (int i = 1; i < number; i++) {
            sentence = sentence + words;
        }
        return sentence;
    }
}