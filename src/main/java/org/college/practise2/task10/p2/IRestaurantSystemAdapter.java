package org.college.practise2.task10.p2;

interface IRestaurantSystemAdapter {
    String[] processTableRequest(int[] tableNumbers);
    void processOrderWithoutResult(int[] tableNumbers);
    boolean checkSystemStatus();
    void connect(String url);
    void disconnect();
    void confirmChanges();
    void undoChanges(String reason);
}
