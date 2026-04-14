package command.bad;

public class Main {
    public static void main(String[] args) {
        Remote remote=new Remote(new Light(),new Fan(),new AC());
        remote.turnOnLight();
        remote.turnOffLight();

        remote.turnOnFan();
        remote.turnOffFan();

        remote.turnOnAC();
        remote.setAcTemperature(24);
        remote.turnOffAC();

    }

}
