package composite.good;

public class Main {
    public static void main(String[] args) {
        File file1=new File("File1");
        File file2=new File("File2");
        File resume=new File("Resume.pdf");
        File notes=new File("Notes.txt");
        File goa=new File("Goa.jpa");
        File beach=new File("Beach.jpa");
        Folder documents=new Folder("Documents");
        documents.add(resume);
        documents.add(notes);

        Folder Images=new Folder("Images");
//        Images.add(goa);
//        Images.add(beach);

        Folder root=new Folder("Root");
        root.add(file1);
        root.add(file2);
        root.add(documents);
        root.add(Images);

        Folder vacation=new Folder("Vacation");
        vacation.add(goa);
        vacation.add(beach);
        Images.add(vacation);
        root.show();
    }
}
