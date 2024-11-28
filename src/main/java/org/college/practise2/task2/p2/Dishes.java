package org.college.practise2.task2.p2;

import java.util.ArrayList;

public class Dishes {
    private String name;
    private int price;
    private int mass;
    private String describe;
    private ArrayList<String> ingredients;
    private boolean withMeet;
    private boolean withVeg;
    private DishType type;

    public Dishes(String name, int price, int mass, String describe, ArrayList<String> ingredients, boolean withMeet, boolean withVeg, DishType type) {
        this.name = name;
        this.price = price;
        this.mass = mass;
        this.describe = describe;
        this.ingredients = ingredients;
        this.withMeet = withMeet;
        this.withVeg = withVeg;
        this.type = type;
    }
    public Dishes(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public boolean isWithMeet() {
        return withMeet;
    }

    public void setWithMeet(boolean withMeet) {
        this.withMeet = withMeet;
    }

    public boolean isWithVeg() {
        return withVeg;
    }

    public void setWithVeg(boolean withVeg) {
        this.withVeg = withVeg;
    }

    public DishType getType() {
        return type;
    }

    public void setType(DishType type) {
        this.type = type;
    }
}
