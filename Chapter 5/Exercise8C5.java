import java.util.Random;

public class Exercise8C5 {
    public static void main(String[] args) {
        randomWalk();
    }
    
    public static void randomWalk() {
        Random rand = new Random();
        int position = 0;
        int max = 0;

        while (position != 3 && position != -3) {
            int step = rand.nextInt(2);
            if (step == 0) {
                position = position + 1;
            } else {
                position = position - 1;
            }
            if (max < position)
                max = position;

            System.out.println("position = " + position);
        }
        System.out.println("max position = " + max);
    }
}
