package org.college.practise2.task8.p2;

interface RestaurantVisitor {
    String visit(Staff staff);
    String visit(Chef chef);
    String visit(DishType dishType);
    String visitDish(Dish dish);
    String visitIngredient(Ingredient ingredient);
}
