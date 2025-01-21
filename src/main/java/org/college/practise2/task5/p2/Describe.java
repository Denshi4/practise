package org.college.practise2.task5.p2;

public class Describe extends DishComponent {
    private String _text;
    private String _image;

    public Describe(String name, String text, String image) {
        this.name = name;
        this._text = text;
        this._image = image;
    }

    @Override
    public void order() {
        System.out.println("Order Describe: " + name + "; text: \"" + _text + "\"; image: \"" + _image + "\"");
    }

    @Override
    public void addComponent(DishComponent component) {
        throw new UnsupportedOperationException("Cannot add a component to a Describe.");
    }

    @Override
    public void removeComponent(String name) {
        throw new UnsupportedOperationException("Cannot remove a component from a Describe.");
    }
}
