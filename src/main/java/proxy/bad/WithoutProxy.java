package proxy.bad;

public class WithoutProxy {
    public static void main(String[] args) {
        Database db=new Database();
        db.deleteData();
    }
}
