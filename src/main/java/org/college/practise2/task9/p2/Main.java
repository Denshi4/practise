package org.college.practise2.task9.p2;

public class Main {
    public static void main(String[] args) {
        RestaurantAccess realRestaurantSystem = new RestaurantAccess();
        RestaurantAccessProxy proxy = new RestaurantAccessProxy(realRestaurantSystem);
        RestaurantController controller = new RestaurantController(proxy);

        proxy.open("https://MyRestourantDatabase/localhost:2665.ua");
        controller.addReservation();

        proxy.executeQuery(new int[]{101, 202, 303});

        controller.addMenuItem();
        proxy.confirmChanges();

        proxy.close();
    }
}
