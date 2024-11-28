package org.college.practise2.task2.p2;

import java.util.ArrayList;

public abstract class DishesBuilder {
    private Dishes dish;

    public abstract void setBasicParams(String name, int price, int mass);
    public abstract void setTypeParams(DishType type);
    public abstract void setIngredientParams(ArrayList<String> ingr, boolean withMeet, boolean withVeg);
    public abstract void setDescribe(String describe);
    public abstract Dishes build();
}
