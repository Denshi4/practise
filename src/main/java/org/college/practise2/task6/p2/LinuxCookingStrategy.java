package org.college.practise2.task6.p2;

class LinuxCookingStrategy implements CookingStrategy {

    @Override
    public void prepareDish(Dish dish) {
        System.out.println("The dish \"" + dish.getDishName() + "\" was prepared using Linux equipment.");
    }

    @Override
    public void serveDish(Dish dish) {
        System.out.println("The dish \"" + dish.getDishName() + "\" was served using Linux equipment.");
    }

    @Override
    public void cleanupAfterCooking(Dish dish) {
        System.out.println("Cleanup after preparing \"" + dish.getDishName() + "\" was done using Linux equipment.");
    }
}
