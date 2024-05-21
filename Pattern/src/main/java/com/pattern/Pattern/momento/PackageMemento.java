package com.pattern.Pattern.momento;
public class PackageMemento {
    private final PackageState state;

    public PackageMemento(PackageState state) {
        this.state = state;
    }

    public PackageState getState() {
        return state;
    }
}