package org.college.practise2.task6.p2;

class Dish {
    private String dishName;
    private String dishCategory;
    private Chef preparedBy;

    public Dish(String dishName, String dishCategory, Chef preparedBy) {
        this.dishName = dishName;
        this.dishCategory = dishCategory;
        this.preparedBy = preparedBy;
    }

    public String getDishName() {
        return dishName;
    }

    public String getDishCategory() {
        return dishCategory;
    }

    public Chef getPreparedBy() {
        return preparedBy;
    }
}
