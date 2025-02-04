package org.college.practise2.task9.p2;

import java.time.LocalDateTime;

class RestaurantAccessProxy implements IRestaurantAccessProxy {
    private RestaurantAccess _restaurantHandle;

    public RestaurantAccessProxy(RestaurantAccess restaurantHandle) {
        this._restaurantHandle = restaurantHandle;
    }

    @Override
    public String[] executeQuery(int[] tableNumbers) {
        var startTime = LocalDateTime.now();
        String[] result = _restaurantHandle.executeQuery(tableNumbers);
        var endTime = LocalDateTime.now();
        System.out.println("Time in database: " + (endTime.getSecond() - startTime.getSecond()) + " s");
        return result;
    }

    @Override
    public void executeQueryNoResult(int[] tableNumbers) {
        var startTime = LocalDateTime.now();
        _restaurantHandle.executeQueryNoResult(tableNumbers);
        var endTime = LocalDateTime.now();
        System.out.println("Time in database: " + (endTime.getSecond() - startTime.getSecond()) + " s");
    }

    @Override
    public boolean checkSystemStatus() {
        return _restaurantHandle.checkSystemStatus();
    }

    @Override
    public void open(String url) {
        _restaurantHandle.open(url);
    }

    @Override
    public void close() {
        _restaurantHandle.close();
    }

    @Override
    public void confirmChanges() {
        _restaurantHandle.confirmChanges();
    }

    @Override
    public void revertChanges() {
        _restaurantHandle.revertChanges();
    }
}
