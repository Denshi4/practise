package org.college.practise2.task1.t1;

public class Main {
    public static void main(String[] args){

        RestaurantMenu menu1 = RestaurantMenu.getInstance("Curry House");

        Dishes dish1 = new Dishes("Chicken tikka masala", 260, 300);
        Dishes dish2 = new Dishes("Palak Gosht", 320, 300);
        Dishes dish3 = new Dishes("Paratha", 30, 60);

        menu1.addDishes(dish1);
        menu1.addDishes(dish2);
        menu1.addDishes(dish3);

        menu1.set_cuisineType("Indian");
        System.out.println(menu1.get_cuisineType());

        System.out.println(menu1.getDishes("Palak Gosht"));
        System.out.println(menu1.describeDishes(dish3));

        System.out.println("Menu has this dishes: ");
        System.out.println(menu1.getAllDishes().toString());

        menu1.removeDishes(dish1);
        System.out.println("Menu after month: ");
        System.out.println(menu1.getAllDishes().toString());

        System.out.println("Dishes count: ");
        System.out.println(menu1.getDishesCount());

    }
}
