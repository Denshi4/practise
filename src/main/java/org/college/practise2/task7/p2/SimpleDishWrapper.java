package org.college.practise2.task7.p2;

public class SimpleDishWrapper extends AbstractWrapper {

    public SimpleDishWrapper() {
        super(null);
    }

    @Override
    public void serve(Dish dish) {
        System.out.println("Serving dish: " + dish.getName() + " - " + dish.getDescription());
    }
}
