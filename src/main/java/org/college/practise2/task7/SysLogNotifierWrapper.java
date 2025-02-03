package org.college.practise2.task7;

public class SysLogNotifierWrapper extends AbstractWrapper {
    private String journalName;

    public SysLogNotifierWrapper(INotificationWrapper wrappee, String journalName) {
        super(wrappee);
        this.journalName = journalName;
    }

    public SysLogNotifierWrapper(INotificationWrapper wrappee) {
        super(wrappee);
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Write log to journal " + journalName + ": " + alert.getMessage());
        super.notify(alert);
    }
}
