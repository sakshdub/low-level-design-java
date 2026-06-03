package state.good;

public class Walking implements TransportationMode {

    @Override
    public int calETA() {
        System.out.println("Calculating ETA (working");
        return 10;
    }

    @Override
    public String getDirection() {
        return "Direction for walking.";
    }
}
