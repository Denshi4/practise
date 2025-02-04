package org.college.practise2.task10.p2;

class RestaurantSystem implements IRestaurantProxy {
    private String _url;
    private boolean _isConnected;
    private IRestaurantSystemAdapter _adapter;

    public RestaurantSystem(IRestaurantSystemAdapter adapter) {
        this._adapter = adapter;
    }

    public void setCuisineAdapter(IRestaurantSystemAdapter adapter) {
        this._adapter = adapter;
    }

    @Override
    public String[] processTableRequest(int[] tableNumbers) {
        return _adapter.processTableRequest(tableNumbers);
    }

    @Override
    public void processOrderWithoutResult(int[] tableNumbers) {
        _adapter.processOrderWithoutResult(tableNumbers);
    }

    @Override
    public boolean checkSystemStatus() {
        return _adapter.checkSystemStatus();
    }

    @Override
    public void connect(String url) {
        _url = url;
        _isConnected = true;
        _adapter.connect(url);
    }

    @Override
    public void disconnect() {
        _isConnected = false;
        _adapter.disconnect();
    }

    @Override
    public void confirmChanges() {
        _adapter.confirmChanges();
    }

    @Override
    public void undoChanges(String reason) {
        _adapter.undoChanges(reason);
    }
}
