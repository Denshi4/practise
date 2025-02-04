package org.college.practise2.task10.p2;

class SouthIndianCuisineAdapter implements IRestaurantSystemAdapter {
    private String _url;

    @Override
    public String[] processTableRequest(int[] tableNumbers) {
        System.out.println("Processing request for South Indian cuisine");
        return new String[]{"South Indian Dish1", "South Indian Dish2"};
    }

    @Override
    public void processOrderWithoutResult(int[] tableNumbers) {
        System.out.println("Processing order without result for South Indian cuisine");
    }

    @Override
    public boolean checkSystemStatus() {
        System.out.println("Checking status of South Indian cuisine system");
        return true;
    }

    @Override
    public void connect(String url) {
        _url = url;
        System.out.println("Connecting to South Indian cuisine system: " + url);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from South Indian cuisine system");
    }

    @Override
    public void confirmChanges() {
        System.out.println("Confirming changes in South Indian cuisine system");
    }

    @Override
    public void undoChanges(String reason) {
        System.out.println("Undoing changes in South Indian cuisine system: " + reason);
    }
}
