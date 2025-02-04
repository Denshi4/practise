package org.college.practise2.task9.p2;

class RestaurantController {
    private IRestaurantAccessProxy restaurantHandle;

    public RestaurantController(IRestaurantAccessProxy restaurantHandle) {
        this.restaurantHandle = restaurantHandle;
    }

    public void addReservation() {
        System.out.println("Add reservation to restaurant system");
    }

    public void cancelReservation() {
        System.out.println("Cancel reservation in restaurant system");
    }

    public void modifyMenu() {
        System.out.println("Modify menu in restaurant system");
    }

    public void addMenuItem() {
        System.out.println("Add menu item to restaurant system");
    }

    public void removeMenuItem() {
        System.out.println("Remove menu item from restaurant system");
    }
}
