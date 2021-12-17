public class DrawBox2 {
    
    public static void main(String[] args) {
        drawBox(5, 8);
    }
    public static void drawBox(int height, int width) {
        writeChars('*', width);
        System.out.println();

        for (int i = 1; i <= height - 2; i++){
            System.out.print("*");
            writeChars(' ', width - 2);
            System.out.println("*");
        }
        writeChars('*', width);
    }
    public static void writeChars(char ch, int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(ch);
        }
    }
}
