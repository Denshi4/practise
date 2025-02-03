package org.college.practise2.task8.p2;

import java.util.ArrayList;
import java.util.List;

class Menu {
    private List<MenuItem> items = new ArrayList<>();
    private RestaurantVisitor serializer;

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void save() {
        save("json");
    }

    public void save(String format) {
        if (format.equals("db")) {
            serializer = new RestaurantDatabaseVisitor();
        } else if (format.equals("json")) {
            serializer = new RestaurantJsonVisitor();
        }

        for (MenuItem item : items) {
            System.out.println(item.accept(serializer));
        }
    }
}
