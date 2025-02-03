package org.college.practise2.task7.p2;

public class CurrySauceWrapper extends AbstractWrapper {
    private String curryType;

    public CurrySauceWrapper(IDishWrapper wrappee, String curryType) {
        super(wrappee);
        this.curryType = curryType;
    }

    @Override
    public void serve(Dish dish) {
        System.out.println("Adding curry sauce: " + curryType);
        super.serve(dish);
    }
}
