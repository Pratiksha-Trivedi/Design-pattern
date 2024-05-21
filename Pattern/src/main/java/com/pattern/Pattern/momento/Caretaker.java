package com.pattern.Pattern.momento;
import java.util.Stack;

public class Caretaker {
    private Stack<PackageMemento> history = new Stack<>();

    public void save(Package pkg) {
        history.push(pkg.save());
    }

    public void undo(Package pkg) {
        if (!history.isEmpty()) {
            pkg.restore(history.pop());
        } else {
            System.out.println("No states to restore.");
        }
    }
}