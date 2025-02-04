package org.college.practise2.task10;

import java.time.LocalDateTime;

class DBAccessProxy implements IDatabaseAccessProxy {
    private DBAccess _dbHandle;

    public DBAccessProxy(DBAccess dbHandle) {
        this._dbHandle = dbHandle;
    }

    @Override
    public String[] executeQuery(int[] lineNumbers) {
        var startTime = LocalDateTime.now();
        String[] result = _dbHandle.executeQuery(lineNumbers);
        var endTime = LocalDateTime.now();
        System.out.println("Time in database: " + (endTime.getSecond() - startTime.getSecond()) + " s");
        return result;
    }

    @Override
    public void executeQueryNoResult(int[] lineNumbers) {
        var startTime = LocalDateTime.now();
        _dbHandle.executeQueryNoResult(lineNumbers);
        var endTime = LocalDateTime.now();
        System.out.println("Time in database: " + (endTime.getSecond() - startTime.getSecond()) + " s");
    }

    @Override
    public boolean checkDatabaseStatus() {
        return _dbHandle.checkDatabaseStatus();
    }

    @Override
    public void open(String url) {
        _dbHandle.open(url);
    }

    @Override
    public void close() {
        _dbHandle.close();
    }

    @Override
    public void commit() {
        _dbHandle.commit();
    }

    @Override
    public void rollback(String type) {
        _dbHandle.rollback(type);
    }
}