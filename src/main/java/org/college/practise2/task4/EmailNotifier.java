package org.college.practise2.task4;

public class EmailNotifier implements Observer{
    private String uniqueName;

    public EmailNotifier(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    @Override
    public void nootifyy(SystemAlert sysAl) {
        System.out.println(sysAl.toString() + " send to email: " + this.uniqueName);
    }
}
