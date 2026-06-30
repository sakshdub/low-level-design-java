package composite.bad;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    String name;
    List<File> files=new ArrayList<>();
    Folder(String name){
        this.name=name;
    }
    void addFile(File file){
        files.add(file);
    }
    void show(){
        System.out.println(name);
        for(File file:files){
            file.show();
        }
    }

}
