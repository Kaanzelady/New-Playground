public class HourGlass {
    public static final int LINES = 4;

    public static void line() {
        System.out.print("+");
        for (int i = 1; i <= (LINES * 2); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
    public static void topHalf() {
        for (int line = 1; line <= LINES; line++) {
            System.out.print("|");
            int space = line - 1;
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            int dot = LINES * 2 - line * 2;
            for (int i = 1; i <= dot; i++) {
                System.out.print(".");
            }
            System.out.print("/");
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    public static void bottomHalf() {
        for (int line = LINES; line >= 1; line--) {
            System.out.print("|");
            int space = line - 1;
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            System.out.print("/");
            int dot = LINES * 2 - line * 2;
            for (int i = 1; i <= dot; i++) {
                System.out.print(".");
            }
            System.out.print("\\");
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    public static void main(String[] args) {
        line();
        topHalf();
        bottomHalf();
        line();
    }
}