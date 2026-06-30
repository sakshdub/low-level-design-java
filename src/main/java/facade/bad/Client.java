package facade.bad;

public class Client {
    public static void main(String[] args) {
        Cpu cpu=new Cpu();
        Ram ram=new Ram();
        cpu.start();
        ram.load();
    }
}
