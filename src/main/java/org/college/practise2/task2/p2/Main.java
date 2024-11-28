package org.college.practise2.task2.p2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String chooseCountry;
        Dishes picture = new Dishes();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter country (UA/INDIAN): ");
            chooseCountry = scanner.next().toLowerCase();
        } while (!chooseCountry.equals("ua") && !chooseCountry.equals("indian"));

        DishesBuilder dh;

        if(chooseCountry.equals("ua")){
            dh = new UkraineDishesBuilder(picture);

        } else {
            dh = new IndianDishesBuilder(picture);
        }

        dh.setBasicParams("Chicken",120, 200);

        ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add("Chicken");
        ingredients.add("Sauce");
        ingredients.add("Tomato");
        dh.setIngredientParams(ingredients, true, true);

        DishType type1 = new DishType(false, true, true, true, false);
        dh.setTypeParams(type1);
        dh.setDescribe("Hot chicken with tomato");

        dh.build();

    }
}
