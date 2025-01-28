package org.college.practise2.task6.p2;

interface CookingStrategy {
    void prepareDish(Dish dish);

    void serveDish(Dish dish);

    void cleanupAfterCooking(Dish dish);
}
