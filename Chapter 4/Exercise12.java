public class Exercise12 {
    public static void main(String[] args) {
        printTriangleType(5,7,7);
		printTriangleType(6,6,6);
		printTriangleType(5,7,8);
		printTriangleType(2,18,2);

    }
    public static void printTriangleType(int a, int b, int c) {
        // check triangle type first
        if (a == b && a == c) { // equilateral
            System.out.println("equilateral");
        } else if (a != b && a != c && b != c) { // scalene
            System.out.println("scalene");
        } else { // isosceles
            System.
            out.println("isosceles");
        }

    	// ones where one side's length is longer than
        // the sum of the other two
		if ( (a + b < c) || (a + c < b) || (b + c < a) ) {
			throw new IllegalArgumentException("not real triangle");
		}
    }
}
