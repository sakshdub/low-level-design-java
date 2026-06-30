package proxy.good;

public class DatabaseProxy implements Database{
    private Database database;
    public DatabaseProxy(){
        database=new RealDataBase();
    }


    public void deleteData(){
        if(isAdmin()){
            database.deleteData();
        }else{
            System.out.println("Access denied.");
        }
    }
    private boolean isAdmin(){
        return true;
    }
}
