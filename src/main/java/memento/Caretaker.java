package memento;

import java.util.Stack;

public class Caretaker {

    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(Editor graphicEditor) {
        // TODO: Save the current state of the graphic editor by pushing its memento onto the history stack.
        history.push(graphicEditor.save());

    }

    public void undo(Editor graphicEditor){
        // TODO: Restore the last saved state of the graphic editor if history is not empty.
        if(!history.isEmpty()){
            history.pop();
            graphicEditor.restore(history.peek());
        }
    }
}
