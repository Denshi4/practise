package org.college.practise2.task8.p2;

class RestaurantDatabaseVisitor implements RestaurantVisitor {
    @Override
    public String visit(Staff staff) {
        return "visit(Staff)";
    }

    @Override
    public String visit(Chef chef) {
        return "visit(Chef)";
    }

    @Override
    public String visit(DishType dishType) {
        return "visit(DishType)";
    }

    @Override
    public String visitDish(Dish dish) {
        String out = "Dish Name: visit(dish.name) \n";
        out += "Chef: visit(dish.chef) \n";
        out += "Price: " + dish.getPrice() + "\n";
        out += "Vegetarian: " + dish.isVegetarian();
        return out;
    }

    @Override
    public String visitIngredient(Ingredient ingredient) {
        return "visit(Ingredient)";
    }
}
