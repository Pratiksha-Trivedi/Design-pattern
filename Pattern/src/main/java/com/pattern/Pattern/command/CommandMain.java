package com.pattern.Pattern.command;
public class CommandMain {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        TextEditorInvoker invoker = new TextEditorInvoker();

        Command addHello = new AddTextCommand(textEditor, "Hello, ");
        Command addWorld = new AddTextCommand(textEditor, "World!");

        invoker.executeCommand(addHello);
        invoker.executeCommand(addWorld);

        invoker.undoLastCommand();
        invoker.undoLastCommand();
    }
}