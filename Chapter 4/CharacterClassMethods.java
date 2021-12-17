public class CharacterClassMethods {
    public static void main(String[] args) {
        System.out.println(Character.getNumericValue('a'));
        printVertical("message");   
    }
    public static void printVertical(String message) {
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            System.out.println(ch);
        }
    }
}
