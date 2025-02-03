package org.college.practise2.task7.p2;

import java.util.ArrayList;
import java.util.List;

public class DishController {
    private final List<Dish> dishHistory = new ArrayList<>();
    private final IDishWrapper wrapper;

    public DishController(IDishWrapper wrapper) {
        this.wrapper = wrapper;
    }

    public void prepareDish(Dish dish) {
        dishHistory.add(dish);
        wrapper.serve(dish);
    }
}
