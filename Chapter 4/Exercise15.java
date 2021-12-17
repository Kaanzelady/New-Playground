
public class Exercise15 {
    public static void main(String[] args) {
        System.out.printf("%.1f", getGrade(66));
    }
    public static double getGrade(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("grade lower than 0 or higher than 100");    
        }
        
        double grade = 0.7;

        if (score < 60) {
            return 0.0;
        } else if (score >= 95) {
            return 4.0;
        } else if (60 <= score && score <= 62) {
            return grade;
        }
        for (int i = 63; i <= score; i++) {
            grade += 0.1;
        }
        return grade;
    }
}
