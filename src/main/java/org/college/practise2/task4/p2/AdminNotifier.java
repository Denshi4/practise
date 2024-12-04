package org.college.practise2.task4.p2;

public class AdminNotifier implements Observer {
    private int _tableNumber;

    public AdminNotifier(int tableNumber) {
        this._tableNumber = tableNumber;
    }

    @Override
    public void nootifyy(SystemAlert sysAl) {
        System.out.println(sysAl.toString() + " admin sey on table number " + this._tableNumber);
    }
}
