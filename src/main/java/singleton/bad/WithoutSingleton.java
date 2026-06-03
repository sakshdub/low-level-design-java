package singleton.bad;

public class WithoutSingleton {
    public static void main(String[] args) {
        Logger l1=new Logger();
        Logger l2=new Logger();
        l1.log("User logged in.");
        l2.log("Error occured.");
    }
}
