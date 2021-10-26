public class Exercise7 {
    public static void main(String[] args) {
        xo(5);
        xo(6);
    }

    public static void xo(int size) {
        int front = 1;
        int back = size;
        
        for(int i = 1; i <= size; i++) {
            for(int j = 1; j <= size; j++) {
                if(j == front || j == back) {
                    System.out.print("x");
                } else {
                    System.out.print("o");
                }
            }
            System.out.println();
            front++;
            back--;
        }
    }   
}
