package com.pattern.Pattern.momento;
public class Package {
    private PackageState state = new OrderedState();

    public void setState(PackageState state) {
        this.state = state;
    }

    public PackageState getState() {
        return state;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }

    public PackageMemento save() {
        return new PackageMemento(state);
    }

    public void restore(PackageMemento memento) {
        this.state = memento.getState();
    }
}