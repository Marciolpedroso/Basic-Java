package marcio.pedroso.firstweek;

public class ifElse {
    public static void main (String[] args) {
        int a, b;

        a = 5;
        b = 5;
        String result = "";

        if(a==b)
            result = "true";
        else
            result = "false";

        System.out.println(result);

        //We can use another operator type.
        //String result = a==b ?"true" : "false;
    }
}
