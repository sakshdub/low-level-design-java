package composite.bad;

public class Main {
    public static void main(String[] args) {
        Folder docs=new Folder("Documents");
        docs.addFile(new File("Resume.pdf"));
        docs.addFile(new File("Notes.txt"));;
        docs.show();
    }
}
