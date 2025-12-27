public class App {
    public static void main(String[] args) throws Exception {
        String firstName = "Marcio";
        String lastName = "Pedroso";

        String fullName = fullName(firstName, lastName);
        System.out.println(fullName);
    }

    public static String fullName (String firstName, String lastName) {
        return "Result of method: " + firstName.concat(" ").concat(lastName);
    }
}
