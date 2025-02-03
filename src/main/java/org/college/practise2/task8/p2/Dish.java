package org.college.practise2.task8.p2;

import java.time.LocalDateTime;

class Dish implements MenuItem {
    private String name;
    private Chef chef;
    private double price;
    private boolean isVegetarian;
    private DishType type;

    public Dish(String name, Chef chef, double price, boolean isVegetarian, DishType type) {
        this.name = name;
        this.chef = chef;
        this.price = price;
        this.isVegetarian = isVegetarian;
        this.type = type;
    }

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public LocalDateTime getCreationDate() {
        return null;
    }

    public String getType() {
        return type.toString();
    }

    public Chef getChef() {
        return chef;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public String accept(RestaurantVisitor visitor) {
        return visitor.visitDish(this);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", chef=" + chef +
                ", price=" + price +
                ", isVegetarian=" + isVegetarian +
                ", type=" + type +
                '}';
    }
}
