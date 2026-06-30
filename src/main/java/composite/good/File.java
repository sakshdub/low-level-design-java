package composite.good;

public class File implements FileSystemComponents{
    String name;
    public File(String name){
        this.name=name;
    }
    public void show(){
        System.out.println(name);
    }
}
