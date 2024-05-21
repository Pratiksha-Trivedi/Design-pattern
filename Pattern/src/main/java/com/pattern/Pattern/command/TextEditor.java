package com.pattern.Pattern.command;
public class TextEditor {
    private StringBuilder content = new StringBuilder();

    public void addText(String text) {
        content.append(text);
        System.out.println("Added text: " + text);
        System.out.println("Current content: " + content);
    }

    public void removeText(String text) {
        int start = content.lastIndexOf(text);
        if (start != -1) {
            content.delete(start, start + text.length());
            System.out.println("Removed text: " + text);
            System.out.println("Current content: " + content);
        }
    }

    public String getContent() {
        return content.toString();
    }
}