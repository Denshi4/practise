package org.college.practise2.task8.p2;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("India", "Mumbai", "Spice Street", "12", "Near Market");
        Staff staff1 = new Staff("Raj", LocalDateTime.now(), address1);

        Address address2 = new Address("India", "Delhi", "Tandoor Road", "24", "Opposite Mall");
        Chef chef1 = new Chef("Amit", LocalDateTime.now(), address2, "Tandoori", LocalDateTime.now());

        Dish dish1 = new Dish("Butter Chicken", chef1, 500.0, false, DishType.MAIN_COURSE);
        Ingredient ingredient1 = new Ingredient("Garam Masala", "SpiceCo");

        Menu menu = new Menu();
        menu.addItem(staff1);
        menu.addItem(chef1);
        menu.addItem(dish1);
        menu.addItem(ingredient1);

        System.out.println("JSON: ");
        menu.save("json");
        System.out.println(" ");
        System.out.println("DB: ");
        menu.save("db");
    }
}
