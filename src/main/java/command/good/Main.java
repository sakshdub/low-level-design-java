package command.good;

import command.good.command.*;
import command.good.receiver.AC;
import command.good.receiver.Fan;
import command.good.receiver.Light;

public class Main {
    public static void main(String[] args) {

        Light light = new Light();
        Fan fan = new Fan();
        AC ac = new AC();

        Command lightOn = new LightOnCommand(light);
        Command fanOn = new FanOnCommand(fan);
        Command acOn = new AcOnCommand(ac);

        Command lightOff = new LightOffCommand(light);
        Command fanOff = new FanOffCommand(fan);
        Command acOff = new AcOffCommand(ac);

        Command acTempSet = new AcTempSetCommand(ac, 25);

        Remote remote = new Remote();

        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();

        remote.setCommand(fanOn);
        remote.pressButton();

        remote.setCommand(fanOff);
        remote.pressButton();

        remote.setCommand(acOn);
        remote.pressButton();

        remote.setCommand(acOff);
        remote.pressButton();

        remote.setCommand(acTempSet);
        remote.pressButton();
    }
}