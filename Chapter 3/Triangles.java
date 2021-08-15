public class Triangles {
    public static double hypotenuse(double a, double b) {
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;
    }
    
    public static void main(String[] args) {
        System.out.println(hypotenuse(3, 4));
    }

}