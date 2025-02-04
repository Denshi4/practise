package org.college.practise2.task9.p2;

interface IRestaurantAccessProxy {
    String[] executeQuery(int[] tableNumbers);
    void executeQueryNoResult(int[] tableNumbers);
    boolean checkSystemStatus();
    void open(String url);
    void close();
    void confirmChanges();
    void revertChanges();
}
