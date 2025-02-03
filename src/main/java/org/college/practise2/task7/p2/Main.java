package org.college.practise2.task7.p2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        IDishWrapper wrappee1 = new SimpleDishWrapper();

        System.out.println("Enter curry type (masala, korma, tikka): ");
        String curryType = scanner.nextLine();

        System.out.println("Enter topping (paneer, chicken, lamb): ");
        String topping = scanner.nextLine();

        System.out.println("Enter spice level (mild, medium, spicy, extra_spicy): ");
        String spiceLevel = scanner.nextLine();

        if (!curryType.isEmpty()) {
            wrappee1 = new CurrySauceWrapper(wrappee1, curryType);
        }

        if (!topping.isEmpty()) {
            wrappee1 = new ToppingWrapper(wrappee1, topping);
        }

        if (!spiceLevel.isEmpty()) {
            wrappee1 = new SpiceWrapper(wrappee1, SpiceLevel.valueOf(spiceLevel.toUpperCase()));
        }

        DishController controller = new DishController(wrappee1);

        Dish dish = new Dish("Indian Thali", "A traditional Indian meal");
        controller.prepareDish(dish);
    }
}
