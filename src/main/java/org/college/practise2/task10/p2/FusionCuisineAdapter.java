package org.college.practise2.task10.p2;

class FusionCuisineAdapter implements IRestaurantSystemAdapter {
    private String _authToken;
    private long _sessionExpiry;

    @Override
    public String[] processTableRequest(int[] tableNumbers) {
        System.out.println("Processing request for Fusion cuisine.");
        return new String[]{"Fusion Dish1", "Fusion Dish2"};
    }

    @Override
    public void processOrderWithoutResult(int[] tableNumbers) {
        System.out.println("Processing order without result for Fusion cuisine.");
    }

    @Override
    public boolean checkSystemStatus() {
        System.out.println("Checking status of Fusion cuisine system.");
        return true;
    }

    @Override
    public void connect(String url) {
        _authToken = "FusionToken";
        _sessionExpiry = System.currentTimeMillis() + 3600000; // 1-hour session
        System.out.println("Connecting to Fusion cuisine system with token.");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from Fusion cuisine system.");
    }

    @Override
    public void confirmChanges() {
        System.out.println("Confirming changes in Fusion cuisine system.");
    }

    @Override
    public void undoChanges(String reason) {
        System.out.println("Undoing changes in Fusion cuisine system: " + reason);
    }
}
