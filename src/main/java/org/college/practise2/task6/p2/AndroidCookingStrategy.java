package org.college.practise2.task6.p2;

class AndroidCookingStrategy implements CookingStrategy {

    @Override
    public void prepareDish(Dish dish) {
        System.out.println("The dish \"" + dish.getDishName() + "\" was prepared using Android equipment.");
    }

    @Override
    public void serveDish(Dish dish) {
        System.out.println("The dish \"" + dish.getDishName() + "\" was served using Android equipment.");
    }

    @Override
    public void cleanupAfterCooking(Dish dish) {
        System.out.println("Cleanup after preparing \"" + dish.getDishName() + "\" was done using Android equipment.");
    }
}
