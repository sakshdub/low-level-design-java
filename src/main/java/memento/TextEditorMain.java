package memento;

import java.util.Scanner;

public class TextEditorMain {

    public void run() {

        Scanner sc = new Scanner(System.in);
        Editor graphicEditor = new Editor();
        Caretaker caretaker = new Caretaker();

        for (int i = 0; i < 3; i++) {
            String shape = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            String color = sc.next();
            int size = sc.nextInt();

            graphicEditor.setShape(shape, x, y, color, size);
            caretaker.saveState(graphicEditor);
        }
        sc.close();

        caretaker.undo(graphicEditor);

        System.out.println(graphicEditor.getShape());
    }

    // ✅ ADD THIS
    public static void main(String[] args) {
        new TextEditorMain().run();
    }
}