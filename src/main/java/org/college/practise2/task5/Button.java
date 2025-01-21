package org.college.practise2.task5;

public class Button extends WindowComponent {
    private String _text;
    private String _imagePath;

    public Button(String name, String text, String imagePath) {
        this.name = name;
        this._text = text;
        this._imagePath = imagePath;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Describe: " + name + "; text: \"" + _text + "\"; image: \"" + _imagePath + "\"");
    }

    @Override
    public void addComponent(WindowComponent component) {
        throw new UnsupportedOperationException("Cannot add a component to a Describe.");
    }

    @Override
    public void removeComponent(String name) {
        throw new UnsupportedOperationException("Cannot remove a component from a Describe.");
    }
}
