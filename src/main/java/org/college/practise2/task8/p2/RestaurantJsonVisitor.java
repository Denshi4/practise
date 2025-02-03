package org.college.practise2.task8.p2;

class RestaurantJsonVisitor implements RestaurantVisitor {
    @Override
    public String visit(Staff staff) {
        return "visit(staff).json";
    }

    @Override
    public String visit(Chef chef) {
        return "visit(Chef).json";
    }

    @Override
    public String visit(DishType dishType) {
        return "visit(DishType).json";
    }

    @Override
    public String visitDish(Dish dish) {
        return "visit(Dish).json";
    }

    @Override
    public String visitIngredient(Ingredient ingredient) {
        return "visit(Ingredient).json";
    }
}
