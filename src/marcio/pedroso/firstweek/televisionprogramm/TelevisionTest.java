package marcio.pedroso.firstweek.televisionprogramm;

public class TelevisionTest {
    public static void main(String[] args) {
        Television tv = new Television();

        tv.status();             //show the initial state of the TV
        tv.turnOn();             //turn on the TV
        tv.setChannel(5);        //change the TV channel
        tv.increaseVolume();     //increase the TV volume
        tv.status();             //show the actual state of the TV
    }
}
