package composite.bad;

public class File {
    String name;
    File(String name){
        this.name=name;
    }
    void show(){
        System.out.println(name);
    }
}
