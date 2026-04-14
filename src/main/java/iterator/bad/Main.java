package iterator.bad;

public class Main {
    public static void main(String[] args) {
        Playlist playlist=new Playlist();
        playlist.addSong("Song 1");
        playlist.addSong("Song 2");
        playlist.addSong("Song 3");
        for(String song:playlist.getSongs()){
            System.out.println(song);
        }
    }
}
