package org.college.practise2.task5.p2;

public class DishManager extends Dish {
    private Dish window;

    public DishManager(String name, int price, int weight, String dishName) {
        super(name, price, weight, dishName);
    }

    @Override
    public void order() {
        System.out.println("Ordering");
        super.order();

    }
}
