package org.college.practise2.task5.p2;

public class PriceWeight extends DishComponent {
    private int _price;
    private int _weight;

    public PriceWeight(String name, int price, int weight) {
        this.name = name;
        this._price = price;
        this._weight = weight;
    }

    @Override
    public void order() {
        System.out.println("Order PriceWeight: " + name + " | " + _price + " and " + _weight);
        super.order(); //
    }
}
