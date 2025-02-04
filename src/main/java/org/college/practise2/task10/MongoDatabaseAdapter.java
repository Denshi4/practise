package org.college.practise2.task10;

class MongoDatabaseAdapter implements IDatabaseDriverAdapter {
    private String _webToken;
    private long _expirationTime;

    @Override
    public String[] executeQuery(int[] lineNumbers) {
        System.out.println("Executing query on MongoDB database");
        return new String[]{"MongoDB Res1", "MongoDB Res2"};
    }

    @Override
    public void executeQueryNoResult(int[] lineNumbers) {
        System.out.println("Executing query with no result on MongoDB database");
    }

    @Override
    public boolean checkDatabaseStatus() {
        System.out.println("Checking status of MongoDB database");
        return true;
    }

    @Override
    public void open(String url) {
        _webToken = "MongoToken";
        _expirationTime = System.currentTimeMillis() + 3600000;
        System.out.println("Opening MongoDB database with token");
    }

    @Override
    public void close() {
        System.out.println("Closing MongoDB database");
    }

    @Override
    public void commit() {
        System.out.println("Committing changes to MongoDB database");
    }

    @Override
    public void rollback(String type) {
        System.out.println("Rolling back changes in MongoDB database: " + type);
    }
}