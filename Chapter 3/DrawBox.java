public class DrawBox {

    public static void writeChars(char ch, int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(ch);
        }
    }

    public static void drawBox(int height, int width) {
        writeChars('*', width);
        System.out.println();

        for (int i = 1; i <= height - 2; i++) {
            System.out.print('*');
            writeChars(' ', width - 2);
            System.out.println("*");
        }
        writeChars('*', width);
        System.out.println();
    }
    public static void drawBox() {
        writeChars('*', 8);
        System.out.println();
        for (int i = 1; i <= 3; i++) {
            System.out.print("*");
            writeChars(' ', 6);
            System.out.println("*");
        }
        writeChars('*', 8);
        System.out.println();
    }

    public static void main(String[] args) {
        drawBox(5,10);
        drawBox();
    }
}