package iterator.bad;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    List<String> songs;
    public Playlist(){
        songs=new ArrayList<>();
    }
    public void addSong(String song){
        songs.add(song);
    }
    public List<String> getSongs(){
        return songs;
    }
}
