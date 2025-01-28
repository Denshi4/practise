package org.college.practise2.task5;

public class VerticalLayout extends WindowComponent {
    private int _width;
    private int _height;

    public VerticalLayout(String name, int width, int height) {
        this.name = name;
        this._width = width;
        this._height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing : " + name + " | " + _width + "x" + _height);
        super.draw(); //
    }
}
