package org.college.practise2.task5;

public class Window extends WindowComponent{
    private String _title;
    private int _width;
    private int _height;

    public Window(String name, int width, int height, String title) {
        this.name = name;
        this._width = width;
        this._height = height;
        this._title = title;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Dish: " + name + " | " + _width + "x" + _height);
        super.draw();
    }
}

