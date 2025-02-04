package org.college.practise2.task10.p2;

class NorthIndianCuisineAdapter implements IRestaurantSystemAdapter {
    private String _url;

    @Override
    public String[] processTableRequest(int[] tableNumbers) {
        System.out.println("Processing request for North Indian cuisine.");
        return new String[]{"North Indian Dish1", "North Indian Dish2"};
    }

    @Override
    public void processOrderWithoutResult(int[] tableNumbers) {
        System.out.println("Processing order without result for North Indian cuisine.");
    }

    @Override
    public boolean checkSystemStatus() {
        System.out.println("Checking status of North Indian cuisine system.");
        return true;
    }

    @Override
    public void connect(String url) {
        _url = url;
        System.out.println("Connecting to North Indian cuisine system: " + url);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from North Indian cuisine system.");
    }

    @Override
    public void confirmChanges() {
        System.out.println("Confirming changes in North Indian cuisine system.");
    }

    @Override
    public void undoChanges(String reason) {
        System.out.println("Undoing changes in North Indian cuisine system: " + reason);
    }
}
