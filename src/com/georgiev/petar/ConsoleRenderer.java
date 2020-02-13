package com.georgiev.petar;

public class ConsoleRenderer implements Renderer {
    @Override
    public void render(String text) {
        System.out.print(text);
    }

    @Override
    public void renderNewLine() {
        System.out.println();
    }
}
