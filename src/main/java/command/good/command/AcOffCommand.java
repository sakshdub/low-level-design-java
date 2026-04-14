package command.good.command;

import command.good.receiver.AC;

public class AcOffCommand implements Command {

    private AC ac;

    public AcOffCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOff();
    }
}