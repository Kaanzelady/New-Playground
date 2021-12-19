public class Exercise1 {
    public static void main(String[] args) {
        showTwos(15);
        showTwos(50);
    }
    public static void showTwos(int num) {

        int val = num;
        System.out.print(num + " = ");

        int count = 0;
        while(val % 2 == 0) {
            count++;
            val = val / 2;
        }
        
        for (int i = 1; i <= count; i++) {
            System.out.print("2 * ");
        }
        
        System.out.println(val);
    }
}