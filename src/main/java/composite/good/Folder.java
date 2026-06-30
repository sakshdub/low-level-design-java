package composite.good;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponents{
    private String name;
    List<FileSystemComponents>children=new ArrayList<>();
    public Folder(String name){
        this.name=name;
    }
    public void add(FileSystemComponents component){
        children.add(component);
    }
    public void remove(FileSystemComponents component){
        children.remove(component);
    }
    public void show(){
        System.out.println(name);
        for(FileSystemComponents comp:children){
            comp.show();
        }
    }
}
