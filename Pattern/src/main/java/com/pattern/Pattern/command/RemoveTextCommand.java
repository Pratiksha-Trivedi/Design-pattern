package com.pattern.Pattern.command;

public class RemoveTextCommand implements Command {
    private TextEditor textEditor;
    private String text;

    public RemoveTextCommand(TextEditor textEditor, String text) {
        this.textEditor = textEditor;
        this.text = text;
    }

    @Override
    public void execute() {
        textEditor.removeText(text);
    }

    @Override
    public void undo() {
        textEditor.addText(text);
    }
}