package org.college.practise2.task10.p2;

class RestaurantController {
    private IRestaurantProxy restaurantProxy;

    public RestaurantController(IRestaurantProxy restaurantProxy) {
        this.restaurantProxy = restaurantProxy;
    }

    public void addReservation() {
        System.out.println("Adding reservation to restaurant system.");
    }

    public void cancelReservation() {
        System.out.println("Cancelling reservation in restaurant system.");
    }

    public void modifyMenu() {
        System.out.println("Modifying menu in restaurant system.");
    }

    public void addMenuItem() {
        System.out.println("Adding menu item to restaurant system.");
    }

    public void removeMenuItem() {
        System.out.println("Removing menu item from restaurant system.");
    }
}
