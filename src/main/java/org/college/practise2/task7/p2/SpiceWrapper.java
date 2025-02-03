package org.college.practise2.task7.p2;

public class SpiceWrapper extends AbstractWrapper {
    private SpiceLevel spiceLevel;

    public SpiceWrapper(IDishWrapper wrappee, SpiceLevel spiceLevel) {
        super(wrappee);
        this.spiceLevel = spiceLevel;
    }

    @Override
    public void serve(Dish dish) {
        System.out.println("Setting spice level to: " + spiceLevel);
        super.serve(dish);
    }
}
