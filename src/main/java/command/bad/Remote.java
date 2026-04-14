package command.bad;

public class Remote {
    private Light light;
    private Fan fan;
    private AC ac;

    Remote(Light light, Fan fan, AC ac) {
        this.light = light;
        this.fan = fan;
        this.ac = ac;
    }

    public void turnOnLight() {
        light.turnOn();
    }
    public void turnOffLight(){
        light.turnOff();
    }
    public void turnOnFan() {
        fan.turnOn();
    }
    public void turnOffFan() {
        fan.turnOff();
    }
    public void turnOnAC() {
        ac.turnOn();
    }
    public void turnOffAC() {
        ac.turnOff();
    }
    public void setAcTemperature(int temperature){
        ac.setTemperature(temperature);
    }
}
