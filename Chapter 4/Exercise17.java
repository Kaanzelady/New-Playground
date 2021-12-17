public class Exercise17 {
    public static void main(String[] args) {

        System.out.println(stutter("Hello!"));

    }
    public static String stutter(String word) {

        String word2 = "";
        for (int i = 0; i < word.length(); i++) {
            word2 = word2 + word.charAt(i) + word.charAt(i);
        }
        return word2;
    }
}
