package org.college.practise2.task7.p2;

public class ToppingWrapper extends AbstractWrapper {
    private String topping;

    public ToppingWrapper(IDishWrapper wrappee, String topping) {
        super(wrappee);
        this.topping = topping;
    }

    @Override
    public void serve(Dish dish) {
        System.out.println("Adding topping: " + topping);
        super.serve(dish);
    }
}
