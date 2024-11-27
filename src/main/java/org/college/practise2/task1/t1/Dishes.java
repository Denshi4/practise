package org.college.practise2.task1.t1;

public class Dishes {
    private String _name;
    private int _price;
    private int _mass;

    public Dishes(String name, int price, int mass){
        this._name = name;
        this._price = price;
        this._mass = mass;
    }

    public String get_name() {
        return _name;
    }

    public int get_price() {
        return _price;
    }

    public int get_mass() {
        return _mass;
    }

    @Override
    public String toString() {
        return "Dish: " + "name = " + _name + ' ' + " price = " + _price + " mass = " + _mass;
    }
}
