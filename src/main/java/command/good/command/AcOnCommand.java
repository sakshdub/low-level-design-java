package command.good.command;

import command.good.receiver.AC;

public class AcOnCommand implements Command {

    private AC ac;

    public AcOnCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOn();
    }
}