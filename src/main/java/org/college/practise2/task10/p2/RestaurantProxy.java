package org.college.practise2.task10.p2;

import java.time.LocalDateTime;

class RestaurantProxy implements IRestaurantProxy {
    private RestaurantSystem _restaurantSystem;

    public RestaurantProxy(RestaurantSystem restaurantSystem) {
        this._restaurantSystem = restaurantSystem;
    }

    @Override
    public String[] processTableRequest(int[] tableNumbers) {
        var startTime = LocalDateTime.now();
        String[] result = _restaurantSystem.processTableRequest(tableNumbers);
        var endTime = LocalDateTime.now();
        System.out.println("Time in database: " + (endTime.getSecond() - startTime.getSecond()) + " s");
        return result;
    }

    @Override
    public void processOrderWithoutResult(int[] tableNumbers) {
        var startTime = LocalDateTime.now();
        _restaurantSystem.processOrderWithoutResult(tableNumbers);
        var endTime = LocalDateTime.now();
        System.out.println("Time in database: " + (endTime.getSecond() - startTime.getSecond()) + " s");
    }

    @Override
    public boolean checkSystemStatus() {
        return _restaurantSystem.checkSystemStatus();
    }

    @Override
    public void connect(String url) {
        _restaurantSystem.connect(url);
    }

    @Override
    public void disconnect() {
        _restaurantSystem.disconnect();
    }

    @Override
    public void confirmChanges() {
        _restaurantSystem.confirmChanges();
    }

    @Override
    public void undoChanges(String reason) {
        _restaurantSystem.undoChanges(reason);
    }
}
