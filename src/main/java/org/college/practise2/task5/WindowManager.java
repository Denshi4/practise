package org.college.practise2.task5;

public class WindowManager {
    private Window window;

    public WindowManager(Window window) {
        this.window = window;
    }

    public void draw() {
        window.draw();
    }

    public Window getWindow() {
        return window;
    }
}
