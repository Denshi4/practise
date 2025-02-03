package org.college.practise2.task8.p2;

import java.time.LocalDateTime;

class Ingredient implements MenuItem {
    private String name;
    private String supplier;

    public Ingredient(String name, String supplier) {
        this.name = name;
        this.supplier = supplier;
    }

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public LocalDateTime getCreationDate() {
        return null;
    }

    @Override
    public String accept(RestaurantVisitor visitor) {
        return visitor.visitIngredient(this);
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", supplier='" + supplier + '\'' +
                '}';
    }
}
