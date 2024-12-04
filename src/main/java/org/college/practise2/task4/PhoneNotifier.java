package org.college.practise2.task4;

public class PhoneNotifier implements Observer{
    private String phoneNumber;

    public PhoneNotifier(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void nootifyy(SystemAlert sysAl) {
        System.out.println(sysAl.toString() + " send on number " + this.phoneNumber);
    }
}
