package org.college.practise2.task9.p2;

class RestaurantAccess implements IRestaurantAccessProxy {
    private String _url;
    private boolean _isOpen;

    @Override
    public String[] executeQuery(int[] tableNumbers) {
        System.out.println("Executing query with result in restaurant system");
        return new String[]{"Res", "Res2"};
    }

    @Override
    public void executeQueryNoResult(int[] tableNumbers) {
        System.out.println("Executing query without result in restaurant system");
    }

    @Override
    public boolean checkSystemStatus() {
        System.out.println("Checking restaurant system status");
        return _isOpen;
    }

    @Override
    public void open(String url) {
        _url = url;
        _isOpen = true;
        System.out.println("Restaurant system opened: " + url);
    }

    @Override
    public void close() {
        _isOpen = false;
        System.out.println("Restaurant system closed");
    }

    @Override
    public void confirmChanges() {
        System.out.println("Restaurant system changes confirmed");
    }

    @Override
    public void revertChanges() {
        System.out.println("Restaurant system changes reverted");
    }
}
