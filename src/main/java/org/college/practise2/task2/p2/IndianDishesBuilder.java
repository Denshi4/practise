package org.college.practise2.task2.p2;

import java.util.ArrayList;

public class IndianDishesBuilder extends DishesBuilder{

    public IndianDishesBuilder(Dishes dish) {
        this.dish = dish;
    }

    @Override
    public void setBasicParams(String name, int price, int mass) {
        dish.setName(name);
        dish.setPrice(price);
        dish.setMass(mass);
    }

    @Override
    public void setTypeParams(DishType type) {
        dish.setType(type);
    }

    @Override
    public void setIngredientParams(ArrayList<String> ingr, boolean withMeet, boolean withVeg) {
        dish.setIngredients(ingr);
        dish.setWithMeet(withMeet);
        dish.setWithVeg(withVeg);
    }

    @Override
    public void setDescribe(String describe) {
        dish.setDescribe(describe);
    }

    @Override
    public Dishes build() {
        System.out.println("You create indian dish !!! Its spicy ???");
        return dish;
    }
}
