package marcio.pedroso.firstweek;

public class Relational {
    public static void main (String[] args) {
        int n1 = 1;
        int n2 = 2;

        boolean yesNot = n1 == n2;
        System.out.println("Number1 is egal then Number2? " + yesNot);

        yesNot = n1 != n2;
        System.out.println("Number1 is different then Number2? " + yesNot);

        yesNot = n1 < n2;
        System.out.println("Number1 is smaller then Number2? " + yesNot);

        yesNot = n1 > n2;
        System.out.println("Number1 is bigger then Number2? " + yesNot);

        yesNot = n1 <= n2;
        System.out.println("Number1 is smaller or egal then Number2? " + yesNot);

        yesNot = n1 >= n2;
        System.out.println("Number1 is bigger or egal then Number2? " + yesNot);
    }
}
