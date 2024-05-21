package com.pattern.Pattern.momento;
public class MomentoMain {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Package pkg = new Package();

        pkg.printStatus();

        caretaker.save(pkg);
        pkg.nextState();
        pkg.printStatus();

        caretaker.save(pkg);
        pkg.nextState();
        pkg.printStatus();
        caretaker.undo(pkg);
        pkg.printStatus();

        caretaker.undo(pkg);
        pkg.printStatus();
    }
}