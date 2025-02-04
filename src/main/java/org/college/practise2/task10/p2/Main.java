package org.college.practise2.task10.p2;

public class Main {
    public static void main(String[] args) {
        IRestaurantSystemAdapter northIndianAdapter = new NorthIndianCuisineAdapter();
        RestaurantSystem restaurantSystem = new RestaurantSystem(northIndianAdapter);
        RestaurantProxy proxy = new RestaurantProxy(restaurantSystem);
        RestaurantController controller = new RestaurantController(proxy);

        proxy.connect("http://MyRestourant.database.ua");

        controller.addReservation();

        proxy.processTableRequest(new int[]{101, 202, 303});

        controller.addMenuItem();
        proxy.confirmChanges();

        proxy.disconnect();
    }
}
