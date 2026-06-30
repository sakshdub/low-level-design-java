package facade.good;

public class ComputerFacade {
    private Cpu cpu=new Cpu();
    private Ram ram=new Ram();
    public void startComputer(){
        cpu.start();
        ram.load();
    }
}
