package org.college.practise2.task5.p2;

public class Dish extends DishComponent {
    private String _dishName;
    private int _price;
    private int _weight;

    public Dish(String name, int price, int weight, String dishName) {
        this.name = name;
        this._price = price;
        this._weight = weight;
        this._dishName = dishName;
    }

    @Override
    public void order() {
        System.out.println("Ordering Dish: " + name + " | " + _price + " and " + _weight);
        super.order();
    }
}

