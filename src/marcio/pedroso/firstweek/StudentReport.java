package marcio.pedroso.firstweek;

public class StudentReport {
    public static void main(String[] args) {
        int finalScore = 85;
        if (finalScore >= 90) {
            System.out.println("Grade: A");
        } else if (finalScore >= 80) {
            System.out.println("Grade: B");
        } else if (finalScore >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
    }
}
