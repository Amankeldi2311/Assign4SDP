package mementoPattern;

import java.util.Stack;

public class History {
    private Stack<Memento> history = new Stack<Memento>();

    public void save (Memento memento) {
        history.push(memento);
    }

    public Memento undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
