package command.good.receiver;

public class AC {
    public void turnOn(){
        System.out.println("AC is turned on");
    }
    public void turnOff(){
        System.out.println("AC is turned off");
    }
    public void setTemperature(int temperature){
        System.out.println("AC temperature is set to " + temperature + " degrees");
    }
}
