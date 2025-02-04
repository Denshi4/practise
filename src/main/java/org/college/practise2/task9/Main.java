package org.college.practise2.task9;

public class Main {
    public static void main(String[] args) {
        DBAccess database1 = new DBAccess();

        DBAccessProxy proxy1 = new DBAccessProxy(database1);

        DatabaseController controller1 = new DatabaseController(proxy1);


        proxy1.open("https://MyDataBase.ua");
        controller1.addClient();

        proxy1.executeQuery(new int[]{1, 2, 3});
        controller1.addOrder();

        proxy1.commit();
        proxy1.close();
    }

}
