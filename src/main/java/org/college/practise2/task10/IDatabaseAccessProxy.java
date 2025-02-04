package org.college.practise2.task10;

interface IDatabaseAccessProxy {
    String[] executeQuery(int[] lineNumbers);
    void executeQueryNoResult(int[] lineNumbers);
    boolean checkDatabaseStatus();
    void open(String url);
    void close();
    void commit();
    void rollback(String type);
}