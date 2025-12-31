package marcio.pedroso.firstweek.televisionprogramm;

public class Television {

    private boolean on = false;
    private int channel = 1;
    private int volume = 10;

    public void turnOn() {on = true;}
    public void turnOff() {on = false;}

    public void increaseVolume() {if(on && volume < 100) volume++;}
    public void decreaseVolume() {if(on && volume > 0) volume--;}

    public void nextChannel() {if(on) channel ++;}
    public void previousChannel() {if(on && channel > 1) channel--;}

    public void setChannel(int newChannel) {if(on && newChannel >= 1) channel = newChannel;}

    public void status () {
        System.out.println("TV on? " + on);
        System.out.println("Channel: " + channel);
        System.out.println("Volume: " + volume);
    }
}

