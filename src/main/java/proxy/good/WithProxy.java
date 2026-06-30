package proxy.good;

public class WithProxy {
    public static void main(String[] args) {
        Database db=new DatabaseProxy();
        db.deleteData();
    }
}
