package marcio.pedroso.firstweek;

import java.util.Date;

public class Operators {
        //Operators Class.java
        public static void main (String [] args) throws Exception {
            String name = "MARCIO";
            int age = 27;
            double weight = 105.25;
            char gender = 'M';
            boolean organDonor = false;
            Date dateBirth = new Date();


            double sum = 10.5 + 15.7;
            int sub = 113 - 25;
            int multi = 20 * 7;
            int div = 15 / 3;
            int mod = 18 % 3;
            double result = (10 * 7) + (20/4);


            String fullName = "Marcio" + "Pedroso"; //The operator + when used in Strings results in concat, not in math operation.


            //concat = 1+1+1+"1"; //Result 31
            //concat2 = 1+"1"+1+1; //Result 1111
    }
}