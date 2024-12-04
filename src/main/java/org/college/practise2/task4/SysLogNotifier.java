package org.college.practise2.task4;

public class SysLogNotifier implements Observer{
    private String journalName;

    public SysLogNotifier(String journalName) {
        this.journalName = journalName;
    }

    @Override
    public void nootifyy(SystemAlert sysAl) {
        System.out.println(sysAl.toString() + " add in journal " + this.journalName);
    }
}
