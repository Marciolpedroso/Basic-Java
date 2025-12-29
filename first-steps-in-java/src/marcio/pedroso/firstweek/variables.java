package marcio.pedroso.firstweek;

public class variables {
    public static void main(String[] args) throws Exception{
        //Primitive types.
        
        double minimumWage = 2500;

        short shortNumber = 1;
        int normalNumber = shortNumber;
        short shortNumber2 = (short) normalNumber;

        int number = 5; //That variable can be changed.

        final double PI_VALUE = 3.14; //That variable can't be changed, if you try to change, will receive a console error.
        //PI_VALUE = 3.15; //You will receive a error, because that variable can't be changed.
    }   
}
