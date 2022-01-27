public class Exercise9C5 {
    public static void main(String[] args) {
        printFactors(25);
    }

    public static void printFactors(int number) {
        System.out.print(1);

        for (int i = 2; i <= number; i++) {
            if ((number % i) == 0) {
                System.out.print(" and " + i);
            }
        }
    }
}
