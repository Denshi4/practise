package org.college.practise2.task6.p2;

public class ApplicationManager {
    private KitchenController kitchenController;

    public ApplicationManager(String equipmentType) {

        Chef chef = new Chef("Danya", "Filip");
        Dish dish = new Dish("Butter Chicken", "Indian Cuisine", chef);
        kitchenController = new KitchenController(dish);

        switch (equipmentType.toLowerCase()) {
            case "android":
                kitchenController.setCookingStrategy(new AndroidCookingStrategy());
                break;
            case "linux":
                kitchenController.setCookingStrategy(new LinuxCookingStrategy());
                break;
            case "windows":
                kitchenController.setCookingStrategy(new WindowsCookingStrategy());
                break;
            case "mac":
                kitchenController.setCookingStrategy(new MacCookingStrategy());
                break;
            default:
                System.out.println("Unsupported equipment type, sorry");
        }
    }

    public void run() {
        kitchenController.prepareDish();
        kitchenController.serveDish();
        kitchenController.cleanupAfterCooking();
    }
}
