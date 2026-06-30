package proxy.good;

public class RealDataBase implements Database{
    public void deleteData(){
        System.out.println("Data deleted.");
    }
}
