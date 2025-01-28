package org.college.practise2.task6.p2;

class KitchenController {
    private Dish dish;
    private CookingStrategy cookingStrategy;

    public KitchenController(Dish dish) {
        this.dish = dish;
    }

    public void setCookingStrategy(CookingStrategy strategy) {
        this.cookingStrategy = strategy;
    }

    public void prepareDish() {
        if (cookingStrategy != null) {
            cookingStrategy.prepareDish(dish);
        } else {
            System.out.println("No strategy set");
        }
    }

    public void serveDish() {
        if (cookingStrategy != null) {
            cookingStrategy.serveDish(dish);
        } else {
            System.out.println("No strategy set");
        }
    }

    public void cleanupAfterCooking() {
        if (cookingStrategy != null) {
            cookingStrategy.cleanupAfterCooking(dish);
        } else {
            System.out.println("No strategy set");
        }
    }
}
