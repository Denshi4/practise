package org.college.practise2.task4.p2;

public class SayNotifier implements Observer {
    private String _customerName;

    public SayNotifier(String customerName) {
        this._customerName = customerName;
    }

    @Override
    public void nootifyy(SystemAlert sysAl) {
        System.out.println(sysAl.toString() + " waiter say this to " + this._customerName);
    }
}
