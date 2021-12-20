public class Exercise3C5 {
    public static void main(String[] args) {
        System.out.println(toBinary(44));
    }
    public static String toBinary(int num) {
        int temp = num;
        int remainder;
        String strBinary = "";
        while (temp != 0) {
            remainder = temp % 2;
            strBinary = remainder + strBinary;
            temp /= 2;
        }
        return strBinary;
    }
}
