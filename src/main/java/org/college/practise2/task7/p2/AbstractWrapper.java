package org.college.practise2.task7.p2;

public abstract class AbstractWrapper implements IDishWrapper {
    protected IDishWrapper wrappee;

    public AbstractWrapper(IDishWrapper wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void serve(Dish dish) {
        if (wrappee != null) {
            wrappee.serve(dish);
        }
    }
}
