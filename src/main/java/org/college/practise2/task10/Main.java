package org.college.practise2.task10;

public class Main {
    public static void main(String[] args) {
        IDatabaseDriverAdapter msSQLAdapter = new MsSQLDatabaseAdapter();
        DBAccess dbAccess = new DBAccess(msSQLAdapter);
        DBAccessProxy proxy = new DBAccessProxy(dbAccess);
        DatabaseController controller = new DatabaseController(proxy);

        proxy.open("https://MyDataBase.ua");

        controller.addClient();

        proxy.executeQuery(new int[]{101, 202, 303});

        controller.addOrder();
        proxy.commit();

        proxy.close();
    }
}