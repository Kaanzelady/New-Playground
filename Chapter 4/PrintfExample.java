public class PrintfExample {
    public static void main(String[] args) {
        int score = 87;
        double gpa = 3.18652;
        String name = "Jessica";

        System.out.printf("student name: %9s\n", name);
        System.out.printf("exam score  : %9d\n", score);
        System.out.printf("GPA         : %9.2f\n", gpa);

        number(10,10);
    }
    public static void number(int a, int b) {
        for(int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }
    }
}
