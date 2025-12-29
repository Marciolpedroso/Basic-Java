package marcio.pedroso.firstweek;

public class fullName {
    public static void main(String[] args) {
        String firstName = "Marcio";
        String lastName = "Pedroso";

        String fullNames = fullNames(firstName, lastName);
        System.out.println(fullNames);
    }

    public static String fullNames (String firstName, String lastName) {
        return "Result of method: " + firstName.concat(" ").concat(lastName);
    }
}
