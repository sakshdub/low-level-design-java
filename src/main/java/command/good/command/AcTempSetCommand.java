package command.good.command;

import command.good.receiver.AC;

public class AcTempSetCommand implements Command {

    private AC ac;
    private int temp;

    public AcTempSetCommand(AC ac, int temp) {
        this.ac = ac;
        this.temp = temp;
    }

    @Override
    public void execute() {
        ac.setTemperature(temp);
    }
}